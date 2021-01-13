package Frontend;

import Backend.Basic;

import java.io.IOException;
import java.sql.SQLException;

public class BasicProgram {
    public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {
        Basic basicProgram = new Basic();
        //Question 1
        basicProgram.connect();
    }
}
