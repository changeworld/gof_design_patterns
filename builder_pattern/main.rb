require_relative "./director"
require_relative "./salt_water_builder"
require_relative "./sugar_water_builder"

builder = Builder.new(SaltWaterBuilder)
director = Director.new(builder)
director.constract
p builder.result

builder = Builder.new(SugarWaterBuilder)
director = Director.new(builder)
director.constract
p builder.result
