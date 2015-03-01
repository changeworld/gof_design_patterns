class Director
  def initialize(builder)
    @builder = builder
  end

  def constract
    @builder.add_solvent(100)
    @builder.add_solute(40)
    @builder.abandon_solution(70)
    @builder.add_solvent(100)
    @builder.add_solute(15)
  end
end
