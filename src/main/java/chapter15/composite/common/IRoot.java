package chapter15.composite.common;

import java.util.ArrayList;

/**
 * 定义一个根节点，就为总经理服务
 */
public interface IRoot {
    //得到总经理的信息
    String getInfo();
    //总经理下边要有小兵，那要能增加小兵，比如研发部总经理，这是个树枝节点
    void add(IBranch branch);
    //那要能增加树叶节点
    void add(ILeaf leaf);
    //既然能增加，那要还要能够遍历，不可能总经理不知道他手下有哪些人
    ArrayList getSubordinateInfo();
}
