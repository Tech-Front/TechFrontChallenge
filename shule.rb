require  'daniel_otieno'

require_relative  'darasa'

class Shule
  attr_accessor :darasa
  def initialize name
    @name = name
    @darasa = Darasa.new([])
  end
end