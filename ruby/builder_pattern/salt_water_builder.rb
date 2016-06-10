require_relative "./builder"

class SaltWaterBuilder < Builder
  attr_accessor :salt, :water
  def initialize(salt, water)
    @salt = salt.to_f
    @water = water.to_f
  end

  # Add salt
  def add_solute(salt_amount)
    @salt += salt_amount
  end

  # Add water
  def add_solvent(water_amount)
    @water += water_amount
  end

  def abandon_solution(solution_amount)
    salt_delta = solution_amount * (@salt / (@salt + @water))
    water_delta = solution_amount * (@water / (@salt + @water))
    @salt -= salt_delta
    @water -= water_delta
  end
end
