class Darasa
    attr_accessor :members
    def initialize *members
        @members = members.uniq.collect { |member| member.to_s}
    end
