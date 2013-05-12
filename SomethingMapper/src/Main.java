import src.OracleSqlGenerator;

public class Main {
    public static void main(String... args){
        OracleSqlGenerator generator = new OracleSqlGenerator();
        System.out.println(generator.selectAll().from(FooTable.tableName).build());
    };
}
