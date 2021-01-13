package backend;

import entity.CPU;

public class Exercise3 {
    public void QuestionOne(){
        CPU cpu = new CPU();
        CPU.Processor processor = cpu.new Processor();
        System.out.println(processor.getCache());

        CPU.Ram ram = cpu.new Ram();
        System.out.println(ram.getClockSpeed());
    }
}
