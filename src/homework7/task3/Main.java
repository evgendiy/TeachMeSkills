package homework7.task3;

import homework9.AbcException;
import homework9.FinishOfDocException;
import homework9.SequenceNumberException;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Register register = new Register();
        FinancicalNote financicalNote = new FinancicalNote(new Date(2024, 1, 16), "555abc1a2b", 2, 22);
       // GoodsContract goodsContract = new GoodsContract(new Date(2024, 1, 16), "2", "type", 11);
        //EmployeeContract employeeContract = new EmployeeContract(new Date(2024, 1, 16), "3", "Alex", new Date(2025, 1, 16));
        financicalNote.showInfo();
    }

}
