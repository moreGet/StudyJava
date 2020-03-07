package S20200304;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JFileChooser;

public class BufferedInputStreamExam {

	public static void main(String[] args) throws Exception {
		long start = 0;
		long end  = 0;
		
		// ��θ� ��� ���� ���ϼ��� â ����
		JFileChooser jfc = new JFileChooser();
		jfc.showOpenDialog(null);
		
		// OK��ư�� ������ ���ÿ� ������ ������ ��θ� �޾ƿ�
		String pathTmp = jfc.getSelectedFile().getPath();
		
		// Path Ŭ������ �����ι� ����ȭ�� ���� ��θ� ����
		Path path1 = Paths.get(pathTmp).toAbsolutePath().normalize();
		System.out.println(path1.toString());
		File file = new File(path1.toUri()); // �� URI�� �޾� File ��ü�� ����
		
		// ���� �Է� ��Ʈ���� ������
		FileInputStream fis1 = new FileInputStream(file);
		// ���� ��Ʈ���� ������� �ʰ� ������ �д� �ð��� ����ϱ� ���� �Ʒ� ������ ����
		start = System.currentTimeMillis();
		
		// ������ ���� ������ �� �а� �Ǹ� -1�� ������
		while (fis1.read() != -1) {}
		end = System.currentTimeMillis(); // ������ �� �������� ������ ���
		System.out.println("Buffered Stream�� ��� �������� : " + (end-start) + "ms"); // �ð� ���
		fis1.close(); // ����� ��Ʈ���� �ݰ� �ڿ��� �ݳ�
		
		// �Ʒ��� ���� ��Ʈ���� �̿��� �б� �� �ð� ��� ����
		FileInputStream fis2 = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(fis2); // ���� �Է� ��Ʈ���� ü�̴�
		start = System.currentTimeMillis();
		
		while (bis.read() != -1) {} //�б�
		end = System.currentTimeMillis();
		System.out.println("Buffered Stream�� ��� ������ : " + (end-start) + "ms"); // �ð� ���
		bis.close(); // ���� ��Ʈ�� �ݱ� 
		fis1.close(); // �Է� ��Ʈ�� �ݱ�
	}
}