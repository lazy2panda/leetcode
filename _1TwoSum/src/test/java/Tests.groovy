import spock.lang.Specification;
import spock.lang.Unroll;
public class Tests extends Specification {

    @Unroll
    def " version 1 test "(){
        expect:
        Solution solution = new Solution()
        solution.twoSumV1(a as int[], b) == result as int[]
        where:
        [a,b,result]<<dataTable()
    }
    @Unroll
    def " version 2 test "(){
        expect:
        Solution solution = new Solution()
        solution.twoSumV2(a as int[], b) == result as int[]
        where:
        [a,b,result]<<dataTable()
    }

    @Unroll

    static def dataTable() {
        [
                [[1,2,3,4]      ,7  ,[2,3]],
                [[4,6,7,32,56]  ,88 ,[3,4]],
                [[15,2,3,5,6,78],11 ,[3,4]],
                [[0,0,1,2,5]    ,0  ,[0,1]],
                [[3,4,1,2,3]    ,6  ,[0,4]],
                [[3,4,1,2,3]    ,3  ,[2,3]]
        ]
    }
}
