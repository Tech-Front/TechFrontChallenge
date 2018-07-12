class Darasa
    attr_accessor :members
    def initialize *members
        @members = members.uniq.collect { |member| member.to_s}
    end

    def addClassMember
        unless find_member
            self.members << member
        else
            puts "Sorry #{member} already exists"
        end
    end

    def removeClassMember
        if find_member
            self.members -= [ member ]
        else
            puts "Sorry #{member} not found"
        end
    end

    def getDarasaMember
        if find_member
            member
        else
            "Sorry #{member} not found"
        end
    end

    def print
        puts members
    end

    private

    def find_member
        return member if members.include? member
        return false
    end
end





