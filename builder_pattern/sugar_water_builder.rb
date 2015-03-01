require_relative "./builder"

class SugarWaterBuilder < Builder
  attr_accessor :sugar, :water
  def initialize(sugar, water)
    @sugar = sugar.to_f
    @water = water.to_f
  end

  # Add sugar
  def add_solute(sugar_amount)
    @sugar += sugar_amount
  end

  # Add water
  def add_solvent(water_amount)
    @water += water_amount
  end

  def abandon_solution(solution_amount)
    sugar_delta = solution_amount * (@sugar / (@sugar + @water))
    water_delta = solution_amount * (@water / (@sugar + @water))
    @sugar -= sugar_delta
    @water -= water_delta
  end
end
