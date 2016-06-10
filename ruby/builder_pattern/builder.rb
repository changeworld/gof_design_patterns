class Builder
  def initialize(class_name)
    @builder = class_name.new(0,0)
  end

  def add_solute(solute_amount)
    @builder.add_solute(solute_amount)
  end

  def add_solvent(solvent_amount)
    @builder.add_solvent(solvent_amount)
  end

  def abandon_solution(solution_amount)
    @builder.abandon_solution(solution_amount)
  end

  def result
    @builder
  end
end
