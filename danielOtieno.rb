class Darasa
    attr_accessor :members
    def initialize *members
        @members = members.uniq.collect { |member| member.to_s}
    end

    def addClassMember
        unless find member
            self.members << member
        else
            puts "Sorry #{member} already exists"
        end
    end
