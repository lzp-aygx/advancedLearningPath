package study.CXF;

/**
 * Created by Administrator on 2016/6/23.
 */
public class HelloWorldService implements HelloWorldServiceInterface {
    public String sayHello(String name) {
        System.out.println("sayHello called");
        return "hello: " + name;
    }

    public String languageRaning(int ranking) {
        System.out.println("languageRaning called");
        String result = null;
        switch (ranking) {
            case 1:
                result = "java";
                break;
            case 2:
                result = "C";
                break;
            case 3:
                result = "C++";
                break;
            case 4:
                result = "php";
                break;
        }
        return result;
    }
}
