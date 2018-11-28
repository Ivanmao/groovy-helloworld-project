package c10;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class CallingScript {
    public static void main(String[] args) {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("groovy");
        System.out.println("calling script from java");

        try {
            engine.eval("println 'hello from groovy'");
        } catch (ScriptException e) {
            e.printStackTrace();
        }
    }
}

/*
calling script from java
hello from groovy*/
