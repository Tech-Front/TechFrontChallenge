require  'daniel_otieno'

require_relative  'darasa'

class Shule
  attr_accessor :darasa
  def initialize name
    @name = name
    @darasas = Hash.new
  end

  def add_darasa name, darasa
        darasas[name] = darasa
  end

  def remove_darasa name
    darasas.delete(name)
  end

  def get_shule
    puts darasas
  end
end

standard1 = Darasa.new(['john', 'jane', 'jimmy'])
standard2 = Darasa.new(['daniel', 'duncan', 'danny'])
standard3 = Darasa.new(['peter', 'ann', 'mike'])