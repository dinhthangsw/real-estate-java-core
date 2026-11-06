import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== HỆ THỐNG LỌC BĐS ĐA ĐIỀU KIỆN ===");

        List<Property> propertyList = new ArrayList<>();
        propertyList.add(new Apartment("Chung cư Vinhomes Central Park", 4.8, 75.5, 12));
        propertyList.add(new Apartment("Chung cư Masteri Thảo Điền", 3.6, 60.0, 8));
        propertyList.add(new Apartment("Chung cư Lumiere Riverside", 6.5, 85.0, 15));

        // Yêu cầu: Lọc căn hộ có Giá < 5.0 Tỷ VÀ Diện tích >= 70 m2
        System.out.println("\n--- KẾT QUẢ LỌC (Giá < 5.0 Tỷ AND Diện tích >= 70m2) ---");

        List<Property> filteredList = propertyList.stream()
                .filter(p -> p.price < 5.0 && p.area >= 70.0) // Kết hợp 2 điều kiện bằng &&
                .collect(Collectors.toList());

        // In kết quả sau khi lọc
        for (Property p : filteredList) {
            p.displayInfo();
        }
    }
}