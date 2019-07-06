
package com.pxf.project.design.pattern.behavior.interpreter;

/**
 *
 * @author panxiufeng
 * @version Id: Minus.java, v 0.1 2018/10/23 14:46 panxiufeng Exp $$
 */
public class Minus implements Expression{


    @Override
    public int interpret(Context context) {
        return context.getNum1()-context.getNum2();
    }
}