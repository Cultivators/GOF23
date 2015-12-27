package cn.cultivator.iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMyAggregate {
	private List<Object> list = new ArrayList<Object>();
	public List<Object> getList() {
		return list;
	}
	public void setList(List<Object> list) {
		this.list = list;
	}
	public void addObject(Object o){
		this.list.add(o);
	}
	public void removeObject(Object o){
		this.list.remove(o);
	}
	//获取迭代器
	public MyIterator createIterator(){
		return new ConcreteIterator();
	}
	
	private class ConcreteIterator implements MyIterator{
		private int cursor;//定义游标
		@Override
		public void first() {
			cursor=0;
		}

		@Override
		public void next() {
			if(cursor<list.size()){
				cursor++;
			}
		}

		@Override
		public boolean hasNext() {
			if(cursor<list.size()){
				return true;
			}
			return false;
		}

		@Override
		public boolean isFirst() {
			return cursor==0?true:false;
		}

		@Override
		public boolean isLast() {
			return cursor==(list.size()-1)?true:false;
		}

		@Override
		public Object getCurrentObj() {
			return list.get(cursor);
		}
		
	}
}
