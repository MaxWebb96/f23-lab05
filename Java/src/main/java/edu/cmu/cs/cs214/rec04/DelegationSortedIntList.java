package edu.cmu.cs.cs214.rec04;

/**
 * DelegationSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */

public class DelegationSortedIntList implements IntegerList{
    // Write your implementation below with API documentation

    private SortedIntList list;
    private int totalAdded = 0;

    public DelegationSortedIntList(){
        list = new SortedIntList();
    }

    @Override
    public boolean add(int num){

        totalAdded++;
        return list.add(num);
    }

    @Override
    public boolean addAll(IntegerList list){

        totalAdded += list.size();
        return this.list.addAll(list);
    }

    public int getTotalAdded(){
        return totalAdded;
    }

    @Override
    public int size(){
        return list.size();
    }

    @Override
    public int get(int index){
        return list.get(index);
    }

    @Override
    public boolean remove(int num){
        return list.remove(num);
    }

    @Override
    public boolean removeAll(IntegerList list){
        return this.list.removeAll(list);
    }

}