package SBase;

import java.lang.reflect.Method;

// ������̼� ���
// �����Ϸ����� �ڵ� ���� ������ üũ�ϵ��� ������ ����
// ����Ʈ���� ���� ���� ���峪 ��ġ �� �ڵ带 �ڵ����� ������ �� �ֵ��� ������ ����
// ���� ��(��Ÿ�� ��) Ư�� ����� �����ϵ��� ������ ����

//| ElementType ���� ��� | ���� ���                     |
//|-----------------------|-------------------------------|
//| TYPE                  | Ŭ����, �������̽�, ���� Ÿ�� |
//| ANNOTATION_TYPE       | ������̼�                    |
//| FIELD                 | �ʵ�                          |
//| CONSTRUCTOR           | ������                        |
//| METHOD                | �޼ҵ�                        |
//| LOCAL_VARIABLE        | ���� ����                     |
//| PACKAGE               | ��Ű��                        |

//| RetentionPolicy ���Ż�� | ����                                                                                                                    |
//|--------------------------|-------------------------------------------------------------------------------------------------------------------------|
//| SOURCE                   | �ҽ��󿡼��� ������̼� ������ �����Ѵ�. �ҽ� �ڵ带 �м��� ����<br>�ǹ̰� ������ ����Ʈ�ڵ� ���Ͽ��� ������ ���� �ʴ´�. |
//| CLASS                    | ����Ʈ �ڵ� ���ϱ��� ������̼� ������ �����Ѵ�.<br>������ ���÷����� �̿��ؼ�������̼� ������ ���� ���� ����.           |
//| RUNTIME                  | ����Ʈ �ڵ� ���ϱ��� ������̼� ������ �����ϸ鼭<br>���÷����� �̿��ؼ� ��Ÿ�� �ÿ� ������̼� ������ ���� �� �ִ�.       |

// ��Ÿ�� �� ������̼� ���� ����ϱ�
//| ���� Ÿ��     | �޼ҵ��(�Ű�����)   | ����                                  |
//|---------------|----------------------|---------------------------------------|
//| Field[]       | getFields()          | �ʵ� ������ Field �迭�� ����         |
//| Constructor[] | getConstructors()    | ������ ������ Constructor �迭�� ���� |
//| Method[]      | getDeclaredMethods() | �޼ҵ� ������ Method �迭�� ����      |

//�� �޼ҵ�� ������̼� Ÿ���� ��ȯ ������ �Ʒ� �޼ҵ带 ���� ������ �´� �޼ҵ带 ����ؾ��Ѵ�.
//| ���� Ÿ��    | �޼ҵ��(�Ű�����)                                                                                                                                          |
//|--------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------|
//| boolean      | isAnnotationPresent(Class<? extnds Annotation> annotationClass)<br>Class���� ȣ������ �� ���� Ŭ������ ����� ��쿡�� true�� �����Ѵ�.                        |
//| Annotation   | getAnnotation(Class<T> annotationClass)<br>������ ������̼��� ����Ǿ� ������ ������̼��� �����ϰ� �׷��� �ʴٸ� null�� �����Ѵ�. ����Ŭ���� ����ÿ��� ���� |
//| Annotation[] | getAnnotations()<br>����� ��� ������̼� ����, ����Ŭ���� ����� ������̼ǵ� ��� ���� ������ 0�� �迭 ����                                                 |
//| Annotation[] | getDeclaredAnnotations()<br>���� ����� ��� ������̼��� ����. ����Ŭ���� ������̼� ���Ծ���                                                                 |

public class AnnotationExam {

	// *** invoke(���� �ϴ�.)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Service Ŭ�����κ��� �޼ҵ� ������ ����
		Method[] declaredMethods = Service.class.getDeclaredMethods();
		
		//Method ��ü�� �ϳ��� ó��
		for (Method method : declaredMethods) {
			//PrintAnnotation�� ����Ǿ����� Ȯ��
			if(method.isAnnotationPresent(PrintAnnotation.class)) {
				
				//PrintAnnotation ��ü ���
				PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);
				
				//�޼ҵ� �̸� ���
				System.out.println("[" + method.getName() + "] ");
				
				//���м� ���
				for (int i = 0; i < printAnnotation.number(); i++) {
					System.out.print(printAnnotation.value());
					
				}
				System.out.println();
				
				try {
					//�޼ҵ� ȣ��
					method.invoke(new Service()); //method �ȿ� ������̼� ��å�� �����Ŵ
				} catch (Exception e) {
					System.out.println();
				}
			}
		}
	}
}