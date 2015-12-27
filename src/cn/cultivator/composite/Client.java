package cn.cultivator.composite;

public class Client {
	public static void main(String[] args) {
		Folder f1,f2;
		Component c2,c3,c4,c5,c6;
		f1 = new Folder("�ҵ��ĵ�");
		c2 = new ImageFile("ͼƬ�ļ�");
		c3 = new TextFile("�ı��ļ�");
		c4 = new VideoFile("��Ƶ�ļ�");
		f1.add(c2);
		f1.add(c3);
		f1.add(c4);
		f1.killVirus();
		System.out.println("----------�������ŵķֽ���---------");
		f2 = new Folder("�ҵ��ղ�");
		c5 = new VideoFile("�������.avi");
		c6 = new VideoFile("�����˲�.avi");
		f2.add(c5);
		f2.add(c6);
		f1.add(f2);
		f1.killVirus();
	}
}
