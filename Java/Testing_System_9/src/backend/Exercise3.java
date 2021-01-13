package backend;

import entity.CPU;
import org.w3c.dom.ls.LSOutput;

public class Exercise3 {

    public void Question1(){

        CPU cpu = new CPU(100);
        CPU.Ram ram = cpu.new Ram(8, "HP");
        CPU.Processor processor = cpu.new Processor(4, "Dell");

        System.out.println(cpu.getPrice());
        // getClockspeed
        System.out.println(ram.getClockSpeed());

        // get cache
        System.out.println(processor.getCache());
    }
}
