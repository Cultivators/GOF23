package cn.cultivator.composite;

public class Client {
	public static void main(String[] args) {
		Folder f1,f2;
		Component c2,c3,c4,c5,c6;
		f1 = new Folder("我的文档");
		c2 = new ImageFile("图片文件");
		c3 = new TextFile("文本文件");
		c4 = new VideoFile("视频文件");
		f1.add(c2);
		f1.add(c3);
		f1.add(c4);
		f1.killVirus();
		System.out.println("----------我是优雅的分界线---------");
		f2 = new Folder("我的收藏");
		c5 = new VideoFile("神雕侠侣.avi");
		c6 = new VideoFile("天龙八部.avi");
		f2.add(c5);
		f2.add(c6);
		f1.add(f2);
		f1.killVirus();
	}
}
