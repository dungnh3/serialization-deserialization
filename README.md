# serialization-deserialization
# Java Serializable là gì?
- Serialization trong Java là cơ chế chuyển đổi trạng thái của một đối tượng (giá trị các thuộc tính trong object) thành một chuỗi byte sao cho chuỗi byte này có thể chuyển đổi ngược lại thành một đối tượng.
- Quá trình chuyển đổi chuỗi byte thành đối tượng gọi là deserialization.
- Một object có thể serializable (có thể thực hiện Serialization) nếu class của nó thực hiện implements interface java.io.Serializable

# Tại sao cần Serialization?
- Trong Java, khi trao đổi dữ liệu giữa các thành phần khác nhau (giữa các module cùng viết bằng Java) thì dữ liệu được thể hiện dưới dạng byte chứ không phải là đối tượng. Do đó ta cần có một cơ chế để hiểu các đối tượng được gửi và nhận.
- Quá trình serilization hoàn toàn độc lập với platform (không phụ thuộc vào hệ điều hành) nên việc chuyển đổi giữa byte và object giữa các module được đảm bảo.


