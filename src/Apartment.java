// Lớp con kế thừa từ Property bằng từ khóa 'extends'
public class Apartment extends Property {
    private int floorNumber; // Tầng số mấy

    public Apartment(String title, double price, double area, int floorNumber) {
        super(title, price, area); // Gọi constructor của lớp cha
        this.floorNumber = floorNumber;
    }

    // Ghi đè phương thức (Override) để in thêm thông tin riêng của Căn hộ
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Loại hình: Căn hộ chung cư (Tầng thứ " + floorNumber + ")");
        System.out.println("-----------------------------------------");
    }
}