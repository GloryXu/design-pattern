package chapter15.composite.common;

import java.util.ArrayList;

public interface IBranch {
    //获得信息
    String getInfo();
    //增加数据节点，例如研发部下的研发一组
    void add(IBranch branch);
    //增加叶子节点
    void add(ILeaf leaf);
    //获得下级信息
    ArrayList getSubordinateInfo();
}
