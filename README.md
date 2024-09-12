# oop-material

Đây là repo chứa liệu hướng dẫn người học cài đặt và học môn Lập trình hướng đối tượng - INT2204.

## Mục lục

- [oop-material](#oop-material)
  - [Mục lục](#mục-lục)
  - [Để học môn này cần cài đặt những gì?](#để-học-môn-này-cần-cài-đặt-những-gì)
  - [Nên cài đặt phần mềm như thế nào?](#nên-cài-đặt-phần-mềm-như-thế-nào)
    - [JDK Development Kit](#jdk-development-kit)
    - [IntelliJ IDEA _Community Edition_](#intellij-idea-community-edition)
    - [Git](#git)

## Để học môn này cần cài đặt những gì?

Sau đây là một số phần mềm cần thiết để người học có thể học môn này. Tất nhiên sẽ có những phần mềm tương tự với các phần mềm sau, việc sử dụng phần mềm nào là tùy vào người học. Nếu người học chưa biết sử dụng phần mềm nào thì hãy sử dụng các phần mềm được liệt kê. Lưu ý là các phần mềm dưới đây sẽ được sử dụng trên hệ điều hành Windows, nếu người học sử dụng hệ điều hành khác thì hãy tải và cài đặt phiên bản tương tự dành cho hệ điều hành mà người học sử dụng.

1. [JDK Development Kit](https://www.oracle.com/java/technologies/downloads/)
2. [IntelliJ IDEA _Community Edition_](https://www.jetbrains.com/idea/download/)
3. [Git](https://git-scm.com/downloads)

## Nên cài đặt phần mềm như thế nào?

### JDK Development Kit

Đây là phần mềm giúp người dùng phát triển ứng dụng bằng ngôn ngữ lập trình _Java_ - thường được sử dụng để _lập trình hướng đối tượng_. Người học nên lựa chọn phiên bản hỗ trợ dài hạn (LTS) mới nhất để cài đặt như hình dưới.

![](images/jdk.png)

Sau khi tải bộ cài về thì người học mở bộ cài lên và làm theo hướng dẫn của cửa sổ hiện lên là có thể cài thành công (nhấn "Next" liên tục là được).

Sau khi đã cài thành công thì người học cần thêm phần mềm vào biến môi trường _Path_ của Windows thì mới có thể sử dụng được. Người học tiến hành nhấn tổ hợp phím _Windows + R_ rồi gõ vào cửa sổ hiện lên `rundll32 sysdm.cpl,EditEnvironmentVariables` và nhấn _OK_ để mở cửa sổ chỉnh sửa các biến môi trường trong Windows.

![](images/run_windows.png)

![](images/env_windows.png)

Người học tiến hành kích đúp chuột vào dòng có chứa _Path_ ở cột _Variable_ tại ô _User variables for ..._ hoặc _System variables_ để chỉnh sửa. Sau đó người học kích vào _New_ để thêm một đường dẫn mới vào _Path_. Sau đó người học dán đường dẫn đến thư mục _bin_ của phần mềm vào rồi nhấn _OK_ ở các cửa sổ để lưu cài đặt và đóng cửa sổ là hoàn thành.

![](images/edit_env_windows.png)

Để kiểm tra xem người học đã cài đặt đúng và đủ hay chưa thì người học có thể mở cửa sổ _cmd_ lên (bằng cách dùng tổ hợp phím _Windows + R_ &rarr; nhập `cmd` &rarr; _OK_) và gõ vào câu lệnh `java --version` để kiểm tra. Nếu người học sử dụng phiên bản _Java 1.8_ thì câu lệnh sẽ là `java -version` (1 dấu `-`). Nếu kết quả hiện lên như hình dưới là đã thành công.

![](images/cmd_check_java.png)

### IntelliJ IDEA _Community Edition_

IntelliJ IDEA là một môi trường phát triển tích hợp (IDE) mạnh mẽ dành cho các ngôn ngữ lập trình như Java, nổi bật với các tính năng hỗ trợ code thông minh và tự động hóa quy trình phát triển. Với giao diện thân thiện và hiệu suất cao, IntelliJ IDEA giúp tăng năng suất lập trình viên thông qua các công cụ kiểm tra mã nguồn, gợi ý và tích hợp liền mạch với các công cụ phát triển khác. &larr; _Đoạn này được viết bởi ChatGPT_.

Việc cài đặt _IntelliJ IDEA_ chỉ cần lưu ý việc tải đúng phiên bản _Community_. Khi vào trang web tải thì người học cần kéo xuống dưới tìm đúng phiên bản rồi mới tải. Sau khi tải thì việc cài đặt và sử dụng rất dễ dàng nên không cần làm thêm bước gì mới ngoài việc chạy bộ cài và ấn _Next_.

![](images/int_com.png)

### Git

Việc cài đặt Git cũng tương tự như IntelliJ IDEA, chỉ cần chọn đúng phiên bản để cài là sẽ hoàn thành.

![](images/git_01.png)
![](images/git_02.png)

Để kiểm tra xem người học đã cài đặt đúng và đủ hay chưa thì người học có thể mở cửa sổ _cmd_ lên (bằng cách dùng tổ hợp phím _Windows + R_ &rarr; nhập `cmd` &rarr; _OK_) và gõ vào câu lệnh `git --version` để kiểm tra. Nếu kết quả hiện lên như hình dưới là đã thành công.

![](images/git_cmd.png)
