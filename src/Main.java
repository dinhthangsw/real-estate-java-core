import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== HỆ THỐNG QUẢN LÝ DANH SÁCH BĐS ===");

        // Tạo một danh sách (List) để chứa các bất động sản
        List<Property> propertyList = new ArrayList<>();

        // Thêm các bất động sản khác nhau vào danh sách
        propertyList.add(new Apartment("Chung cư Vinhomes Central Park", 4.8, 75.5, 12));
        propertyList.add(new Apartment("Chung cư Masteri Thảo Điền", 3.6, 60.0, 8));

        // Dùng vòng lặp for-each để duyệt qua toàn bộ danh sách và in thông tin
        for (Property p : propertyList) {
            p.displayInfo();
        }
    }
}