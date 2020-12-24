package nju.zjl.cvs.game;

import java.io.Serializable;

public class Operation implements Serializable{
    public Operation(int executor, Instruction inst){
        this.executor = executor;
        this.inst = inst;
    }
    
    public final int executor;
    public final Instruction inst;
}
