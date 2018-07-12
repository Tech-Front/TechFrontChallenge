class Darasa
    attr_accessor :members
    def initialize *members
        @members = members.uniq.collect { |member| member.to_s}
    end

    def add_class_member
        unless find_member
            self.members << member
        else
            puts "Sorry #{member} already exists"
        end
    end

    def remove_class_member
        if find_member
            self.members -= [ member ]
        else
            puts "Sorry #{member} not found"
        end
    end

    def get_darasa_member
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





