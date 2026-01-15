package lab18_DB;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLOutput;

public class Program {
    public class Main {
        private static final String URL = "jdbc:h2:mem:testdb;DB_CLOSE_DELAY=-1";
        private static final String USER = "sa";
        private static final String PASS ="";

        public static void main(String[] args) throws Exception {
            try (Connection conn = DriverManager.getConnection(URL, USER, PASS)) {
                DatabaseMetaData metaData = conn.getMetaData();
                System.out.println(metaData.getDatabaseProductName());
                System.out.println(metaData.getDatabaseProductVersion());
                System.out.println(metaData.getDriverName());
                System.out.println(metaData.getDriverVersion());
                System.out.println(metaData.getURL());

            }
        }
    }
}
