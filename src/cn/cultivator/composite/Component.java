package cn.cultivator.composite;

import java.util.ArrayList;

public interface Component {
	void killVirus();
}

class ImageFile implements Component{
	
	private String name;
	public ImageFile(String name) {
		super();
		this.name = name;
	}
	@Override
	public void killVirus() {
		System.out.println("查杀Image_"+name+"_的病毒");
	}
}

class VideoFile implements Component{
	private String name;
	
	public VideoFile(String name) {
		super();
		this.name = name;
	}
	@Override
	public void killVirus() {
		System.out.println("查杀Video_"+name+"_的病毒");
	}
}
class TextFile implements Component{
	private String name;
	
	public TextFile(String name) {
		super();
		this.name = name;
	}

	@Override
	public void killVirus() {
		System.out.println("查杀Text_"+name+"_的病毒");
	}
}
class Folder implements Component{
	private String name;
	
	public Folder(String name) {
		super();
		this.name = name;
	}
	
	private ArrayList<Component> list = new ArrayList<Component>();
	
	public void add(Component file){
		list.add(file);
	}
	public void remove(int index){
		list.remove(index);
	}
	public void get(int index){
		list.get(index);
	}
	@Override
	public void killVirus() {
		System.out.println("查杀Folder"+name+"_的病毒");
		for(Component c : list){
			c.killVirus();
		}
	}
	
}