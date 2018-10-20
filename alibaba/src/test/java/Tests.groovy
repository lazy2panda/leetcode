import spock.lang.Specification;
import spock.lang.Unroll;
public class Tests extends Specification {

    @Unroll
    def " version 1 test "() {
        expect:

        Main.main(a, b) == result
        where:
        [a, b, result] << dataTable()
    }

    @Unroll

    static def dataTable() {
        [
                ["4 12"      ,"4 6 7 4"  ,14],
                ["5 12"      ,"4 6 7 4 3"  ,17]
        ]
    }
}
