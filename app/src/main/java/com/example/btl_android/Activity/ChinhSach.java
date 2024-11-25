package com.example.btl_android.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.btl_android.Adapter.AdapterChinhSach;
import com.example.btl_android.Model.ModelChinhSach;
import com.example.btl_android.R;

import java.util.ArrayList;

public class ChinhSach extends AppCompatActivity {
    RecyclerView rvChinhSach;
    AdapterChinhSach adapterChinhSach;
    ArrayList<ModelChinhSach> listChinhSach;
    ImageView imgCSBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_chinh_sach);
        rvChinhSach = findViewById(R.id.rvChinhSach);
        imgCSBack = findViewById(R.id.imgCSBack);

        listChinhSach = new ArrayList<>();
        listChinhSach.add(new ModelChinhSach(1,"QUY ĐỊNH VỀ HỖ TRỢ SAO LƯU, CHUYỂN DỮ LIỆU CHO KHÁCH HÀNG 1",
                "I. Các trường hợp hướng dẫn sao lưu dữ liệu, chuyển dữ liệu:\n" +
                "\tKhách hàng mua sản phẩm điện tử (Điện thoại, laptop, PC,...) tại Cửa hàng có nhu cầu sao lưu dữ liệu, chuyển dữ liệu từ thiết bị cũ sang thiết bị mới mua.\n" +
                "\tKhách hàng mua các sản phẩm lưu trữ dữ liệu (Thẻ nhớ, USB, ổ cứng,...) tại Cửa hàng có nhu cầu chuyển dữ liệu, sao lưu dữ liệu vào sản phẩm.\n" +
                "II. Quy định thực hiện:\n" +
                "Khách hàng tự sao lưu, chuyển dữ liệu trên điện thoại, Laptop, PC, thiết bị ngoại vi (USB, thẻ nhớ, ổ cứng gắn ngoài).\n" +
                "\t1.1 Sao lưu dữ liệu:\n" +
                "\t\ta. iPhone: Khách hàng tự sao lưu bằng các hình thức sau: Sao lưu dữ liệu lên iCloud, tạo bản sao lưu dữ liệu cá nhân trên các thiết bị Laptop, PC cá nhân của khách hàng bằng iTunes.\n" +
                "\t\tb. Android, Laptop, PC, thiết bị ngoại vi (USB, thẻ nhớ, ổ cứng gắn ngoài): Khách hàng tự sao lưu dữ liệu vào các thiết bị lưu trữ cá nhân thuộc quyền sở hữu của khách hàng, không lưu trữ trên các thiết bị thuộc quyền sở hữu của cửa hàng.\n" +
                "\t1.2 Chuyển dữ liệu\n" +
                "\t\ta. iPhone sang iPhone và Android sang Android: Khách hàng tự chuyển dữ liệu trực tiếp từ máy sang máy bằng công cụ của hãng hỗ trợ. Trong trường hợp không thể chuyển trực tiếp từ máy sang máy thì khách hàng thông tin qua máy tính cá nhân của khách hàng hoặc đồng bộ iCloud.\n" +
                "\t\tb. Android sang iPhone và ngược lại:Đối với việc chuyển dữ liệu từ Android sang iPhone và từ iPhone sang Android, khách hàng tự thực hiện chuyển dữ liệu.\n" +
                "2. Sao lưu, chuyển dữ liệu trên laptop, PC, thiết bị ngoại vi (USB, thẻ nhớ, ổ cứng gắn ngoài):\n" +
                "\tKhách hàng tự sao lưu, chuyển dữ liệu. Nhân viên cửa hàng hỗ trợ tư vấn, giải thích những ảnh hưởng, rủi ro có thể phát sinh đối với dữ liệu như mất dữ liệu khi thực hiện cài đặt, sửa chữa, bảo hành và các dịch vụ hỗ trợ khác. Trong trường hợp khách hàng không thể tự sao lưu, chuyển dữ liệu và đồng ý cho nhân viên cửa hàng thực hiện sao lưu, chuyển dữ liệu thì khách hàng phải ký tên vào Cam kết miễn trừ trách nhiệm (theo mẫu của Công ty) với mọi rủi ro xảy ra đối với dữ liệu chuyển. Sau khi khách hàng đã ký tên, nhân viên cửa hàng được quyền thực hiện chuyển dữ liệu trên thiết bị khách hàng.\n" +
                "\tĐối với việc chuyển dữ liệu từ Android sang iPhone và từ iPhone sang Android, trường hợp khách hàng không thể tự chuyển dữ liệu sau khi nhân viên cửa hàng đã hướng dẫn thì nhân viên cửa hàng chỉ hỗ trợ chuyển hình ảnh và danh bạ cho khách hàng, ưu tiên đồng bộ danh bạ vào Gmail khách hàng để chuyển qua thiết bị mới. Hình ảnh sẽ được sao lưu vào laptop, PC cá nhân của khách hàng để chuyển qua thiết bị mới.\n" +
                "\tTrong trường hợp dữ liệu của khách hàng phải chuyển vào ổ cứng lưu trữ dữ liệu của cửa hàng thì nhân viên cửa hàng thông báo lại với khách hàng và chỉ được thực hiện chuyển dữ liệu vào ổ cứng lưu trữ dữ liệu của cửa hàng sau khi khách hàng đồng ý và ký vào Cam kết miễn trừ trách nhiệm (theo mẫu của Công ty) với mọi rủi ro xảy ra đối với việc chuyển dữ liệu. Nhân viên cửa hàng xóa ngay lập tức dữ liệu của khách hàng được chuyển qua ổ cứng lưu trữ dữ liệu của cửa hàng trước sự chứng kiến của khách hàng sau khi khách hàng xác nhận dữ liệu đã có đầy đủ trên thiết bị của khách hàng."));
        listChinhSach.add(new ModelChinhSach(2,"QUY ĐỊNH VỀ HỖ TRỢ SAO LƯU, CHUYỂN DỮ LIỆU CHO KHÁCH HÀNG 2",
                "I. Các trường hợp hướng dẫn sao lưu dữ liệu, chuyển dữ liệu:\n" +
                        "\tKhách hàng mua sản phẩm điện tử (Điện thoại, laptop, PC,...) tại Cửa hàng có nhu cầu sao lưu dữ liệu, chuyển dữ liệu từ thiết bị cũ sang thiết bị mới mua.\n" +
                        "\tKhách hàng mua các sản phẩm lưu trữ dữ liệu (Thẻ nhớ, USB, ổ cứng,...) tại Cửa hàng có nhu cầu chuyển dữ liệu, sao lưu dữ liệu vào sản phẩm.\n" +
                        "II. Quy định thực hiện:\n" +
                        "Khách hàng tự sao lưu, chuyển dữ liệu trên điện thoại, Laptop, PC, thiết bị ngoại vi (USB, thẻ nhớ, ổ cứng gắn ngoài).\n" +
                        "\t1.1 Sao lưu dữ liệu:\n" +
                        "\t\ta. iPhone: Khách hàng tự sao lưu bằng các hình thức sau: Sao lưu dữ liệu lên iCloud, tạo bản sao lưu dữ liệu cá nhân trên các thiết bị Laptop, PC cá nhân của khách hàng bằng iTunes.\n" +
                        "\t\tb. Android, Laptop, PC, thiết bị ngoại vi (USB, thẻ nhớ, ổ cứng gắn ngoài): Khách hàng tự sao lưu dữ liệu vào các thiết bị lưu trữ cá nhân thuộc quyền sở hữu của khách hàng, không lưu trữ trên các thiết bị thuộc quyền sở hữu của cửa hàng.\n" +
                        "\t1.2 Chuyển dữ liệu\n" +
                        "\t\ta. iPhone sang iPhone và Android sang Android: Khách hàng tự chuyển dữ liệu trực tiếp từ máy sang máy bằng công cụ của hãng hỗ trợ. Trong trường hợp không thể chuyển trực tiếp từ máy sang máy thì khách hàng thông tin qua máy tính cá nhân của khách hàng hoặc đồng bộ iCloud.\n" +
                        "\t\tb. Android sang iPhone và ngược lại:Đối với việc chuyển dữ liệu từ Android sang iPhone và từ iPhone sang Android, khách hàng tự thực hiện chuyển dữ liệu.\n" +
                        "2. Sao lưu, chuyển dữ liệu trên laptop, PC, thiết bị ngoại vi (USB, thẻ nhớ, ổ cứng gắn ngoài):\n" +
                        "\tKhách hàng tự sao lưu, chuyển dữ liệu. Nhân viên cửa hàng hỗ trợ tư vấn, giải thích những ảnh hưởng, rủi ro có thể phát sinh đối với dữ liệu như mất dữ liệu khi thực hiện cài đặt, sửa chữa, bảo hành và các dịch vụ hỗ trợ khác. Trong trường hợp khách hàng không thể tự sao lưu, chuyển dữ liệu và đồng ý cho nhân viên cửa hàng thực hiện sao lưu, chuyển dữ liệu thì khách hàng phải ký tên vào Cam kết miễn trừ trách nhiệm (theo mẫu của Công ty) với mọi rủi ro xảy ra đối với dữ liệu chuyển. Sau khi khách hàng đã ký tên, nhân viên cửa hàng được quyền thực hiện chuyển dữ liệu trên thiết bị khách hàng.\n" +
                        "\tĐối với việc chuyển dữ liệu từ Android sang iPhone và từ iPhone sang Android, trường hợp khách hàng không thể tự chuyển dữ liệu sau khi nhân viên cửa hàng đã hướng dẫn thì nhân viên cửa hàng chỉ hỗ trợ chuyển hình ảnh và danh bạ cho khách hàng, ưu tiên đồng bộ danh bạ vào Gmail khách hàng để chuyển qua thiết bị mới. Hình ảnh sẽ được sao lưu vào laptop, PC cá nhân của khách hàng để chuyển qua thiết bị mới.\n" +
                        "\tTrong trường hợp dữ liệu của khách hàng phải chuyển vào ổ cứng lưu trữ dữ liệu của cửa hàng thì nhân viên cửa hàng thông báo lại với khách hàng và chỉ được thực hiện chuyển dữ liệu vào ổ cứng lưu trữ dữ liệu của cửa hàng sau khi khách hàng đồng ý và ký vào Cam kết miễn trừ trách nhiệm (theo mẫu của Công ty) với mọi rủi ro xảy ra đối với việc chuyển dữ liệu. Nhân viên cửa hàng xóa ngay lập tức dữ liệu của khách hàng được chuyển qua ổ cứng lưu trữ dữ liệu của cửa hàng trước sự chứng kiến của khách hàng sau khi khách hàng xác nhận dữ liệu đã có đầy đủ trên thiết bị của khách hàng."));
        listChinhSach.add(new ModelChinhSach(3,"QUY ĐỊNH VỀ HỖ TRỢ SAO LƯU, CHUYỂN DỮ LIỆU CHO KHÁCH HÀNG 3",
                "I. Các trường hợp hướng dẫn sao lưu dữ liệu, chuyển dữ liệu:\n" +
                        "\tKhách hàng mua sản phẩm điện tử (Điện thoại, laptop, PC,...) tại Cửa hàng có nhu cầu sao lưu dữ liệu, chuyển dữ liệu từ thiết bị cũ sang thiết bị mới mua.\n" +
                        "\tKhách hàng mua các sản phẩm lưu trữ dữ liệu (Thẻ nhớ, USB, ổ cứng,...) tại Cửa hàng có nhu cầu chuyển dữ liệu, sao lưu dữ liệu vào sản phẩm.\n" +
                        "II. Quy định thực hiện:\n" +
                        "Khách hàng tự sao lưu, chuyển dữ liệu trên điện thoại, Laptop, PC, thiết bị ngoại vi (USB, thẻ nhớ, ổ cứng gắn ngoài).\n" +
                        "\t1.1 Sao lưu dữ liệu:\n" +
                        "\t\ta. iPhone: Khách hàng tự sao lưu bằng các hình thức sau: Sao lưu dữ liệu lên iCloud, tạo bản sao lưu dữ liệu cá nhân trên các thiết bị Laptop, PC cá nhân của khách hàng bằng iTunes.\n" +
                        "\t\tb. Android, Laptop, PC, thiết bị ngoại vi (USB, thẻ nhớ, ổ cứng gắn ngoài): Khách hàng tự sao lưu dữ liệu vào các thiết bị lưu trữ cá nhân thuộc quyền sở hữu của khách hàng, không lưu trữ trên các thiết bị thuộc quyền sở hữu của cửa hàng.\n" +
                        "\t1.2 Chuyển dữ liệu\n" +
                        "\t\ta. iPhone sang iPhone và Android sang Android: Khách hàng tự chuyển dữ liệu trực tiếp từ máy sang máy bằng công cụ của hãng hỗ trợ. Trong trường hợp không thể chuyển trực tiếp từ máy sang máy thì khách hàng thông tin qua máy tính cá nhân của khách hàng hoặc đồng bộ iCloud.\n" +
                        "\t\tb. Android sang iPhone và ngược lại:Đối với việc chuyển dữ liệu từ Android sang iPhone và từ iPhone sang Android, khách hàng tự thực hiện chuyển dữ liệu.\n" +
                        "2. Sao lưu, chuyển dữ liệu trên laptop, PC, thiết bị ngoại vi (USB, thẻ nhớ, ổ cứng gắn ngoài):\n" +
                        "\tKhách hàng tự sao lưu, chuyển dữ liệu. Nhân viên cửa hàng hỗ trợ tư vấn, giải thích những ảnh hưởng, rủi ro có thể phát sinh đối với dữ liệu như mất dữ liệu khi thực hiện cài đặt, sửa chữa, bảo hành và các dịch vụ hỗ trợ khác. Trong trường hợp khách hàng không thể tự sao lưu, chuyển dữ liệu và đồng ý cho nhân viên cửa hàng thực hiện sao lưu, chuyển dữ liệu thì khách hàng phải ký tên vào Cam kết miễn trừ trách nhiệm (theo mẫu của Công ty) với mọi rủi ro xảy ra đối với dữ liệu chuyển. Sau khi khách hàng đã ký tên, nhân viên cửa hàng được quyền thực hiện chuyển dữ liệu trên thiết bị khách hàng.\n" +
                        "\tĐối với việc chuyển dữ liệu từ Android sang iPhone và từ iPhone sang Android, trường hợp khách hàng không thể tự chuyển dữ liệu sau khi nhân viên cửa hàng đã hướng dẫn thì nhân viên cửa hàng chỉ hỗ trợ chuyển hình ảnh và danh bạ cho khách hàng, ưu tiên đồng bộ danh bạ vào Gmail khách hàng để chuyển qua thiết bị mới. Hình ảnh sẽ được sao lưu vào laptop, PC cá nhân của khách hàng để chuyển qua thiết bị mới.\n" +
                        "\tTrong trường hợp dữ liệu của khách hàng phải chuyển vào ổ cứng lưu trữ dữ liệu của cửa hàng thì nhân viên cửa hàng thông báo lại với khách hàng và chỉ được thực hiện chuyển dữ liệu vào ổ cứng lưu trữ dữ liệu của cửa hàng sau khi khách hàng đồng ý và ký vào Cam kết miễn trừ trách nhiệm (theo mẫu của Công ty) với mọi rủi ro xảy ra đối với việc chuyển dữ liệu. Nhân viên cửa hàng xóa ngay lập tức dữ liệu của khách hàng được chuyển qua ổ cứng lưu trữ dữ liệu của cửa hàng trước sự chứng kiến của khách hàng sau khi khách hàng xác nhận dữ liệu đã có đầy đủ trên thiết bị của khách hàng."));
        listChinhSach.add(new ModelChinhSach(4,"QUY ĐỊNH VỀ HỖ TRỢ SAO LƯU, CHUYỂN DỮ LIỆU CHO KHÁCH HÀNG 4",
                "I. Các trường hợp hướng dẫn sao lưu dữ liệu, chuyển dữ liệu:\n" +
                        "\tKhách hàng mua sản phẩm điện tử (Điện thoại, laptop, PC,...) tại Cửa hàng có nhu cầu sao lưu dữ liệu, chuyển dữ liệu từ thiết bị cũ sang thiết bị mới mua.\n" +
                        "\tKhách hàng mua các sản phẩm lưu trữ dữ liệu (Thẻ nhớ, USB, ổ cứng,...) tại Cửa hàng có nhu cầu chuyển dữ liệu, sao lưu dữ liệu vào sản phẩm.\n" +
                        "II. Quy định thực hiện:\n" +
                        "Khách hàng tự sao lưu, chuyển dữ liệu trên điện thoại, Laptop, PC, thiết bị ngoại vi (USB, thẻ nhớ, ổ cứng gắn ngoài).\n" +
                        "\t1.1 Sao lưu dữ liệu:\n" +
                        "\t\ta. iPhone: Khách hàng tự sao lưu bằng các hình thức sau: Sao lưu dữ liệu lên iCloud, tạo bản sao lưu dữ liệu cá nhân trên các thiết bị Laptop, PC cá nhân của khách hàng bằng iTunes.\n" +
                        "\t\tb. Android, Laptop, PC, thiết bị ngoại vi (USB, thẻ nhớ, ổ cứng gắn ngoài): Khách hàng tự sao lưu dữ liệu vào các thiết bị lưu trữ cá nhân thuộc quyền sở hữu của khách hàng, không lưu trữ trên các thiết bị thuộc quyền sở hữu của cửa hàng.\n" +
                        "\t1.2 Chuyển dữ liệu\n" +
                        "\t\ta. iPhone sang iPhone và Android sang Android: Khách hàng tự chuyển dữ liệu trực tiếp từ máy sang máy bằng công cụ của hãng hỗ trợ. Trong trường hợp không thể chuyển trực tiếp từ máy sang máy thì khách hàng thông tin qua máy tính cá nhân của khách hàng hoặc đồng bộ iCloud.\n" +
                        "\t\tb. Android sang iPhone và ngược lại:Đối với việc chuyển dữ liệu từ Android sang iPhone và từ iPhone sang Android, khách hàng tự thực hiện chuyển dữ liệu.\n" +
                        "2. Sao lưu, chuyển dữ liệu trên laptop, PC, thiết bị ngoại vi (USB, thẻ nhớ, ổ cứng gắn ngoài):\n" +
                        "\tKhách hàng tự sao lưu, chuyển dữ liệu. Nhân viên cửa hàng hỗ trợ tư vấn, giải thích những ảnh hưởng, rủi ro có thể phát sinh đối với dữ liệu như mất dữ liệu khi thực hiện cài đặt, sửa chữa, bảo hành và các dịch vụ hỗ trợ khác. Trong trường hợp khách hàng không thể tự sao lưu, chuyển dữ liệu và đồng ý cho nhân viên cửa hàng thực hiện sao lưu, chuyển dữ liệu thì khách hàng phải ký tên vào Cam kết miễn trừ trách nhiệm (theo mẫu của Công ty) với mọi rủi ro xảy ra đối với dữ liệu chuyển. Sau khi khách hàng đã ký tên, nhân viên cửa hàng được quyền thực hiện chuyển dữ liệu trên thiết bị khách hàng.\n" +
                        "\tĐối với việc chuyển dữ liệu từ Android sang iPhone và từ iPhone sang Android, trường hợp khách hàng không thể tự chuyển dữ liệu sau khi nhân viên cửa hàng đã hướng dẫn thì nhân viên cửa hàng chỉ hỗ trợ chuyển hình ảnh và danh bạ cho khách hàng, ưu tiên đồng bộ danh bạ vào Gmail khách hàng để chuyển qua thiết bị mới. Hình ảnh sẽ được sao lưu vào laptop, PC cá nhân của khách hàng để chuyển qua thiết bị mới.\n" +
                        "\tTrong trường hợp dữ liệu của khách hàng phải chuyển vào ổ cứng lưu trữ dữ liệu của cửa hàng thì nhân viên cửa hàng thông báo lại với khách hàng và chỉ được thực hiện chuyển dữ liệu vào ổ cứng lưu trữ dữ liệu của cửa hàng sau khi khách hàng đồng ý và ký vào Cam kết miễn trừ trách nhiệm (theo mẫu của Công ty) với mọi rủi ro xảy ra đối với việc chuyển dữ liệu. Nhân viên cửa hàng xóa ngay lập tức dữ liệu của khách hàng được chuyển qua ổ cứng lưu trữ dữ liệu của cửa hàng trước sự chứng kiến của khách hàng sau khi khách hàng xác nhận dữ liệu đã có đầy đủ trên thiết bị của khách hàng."));
        listChinhSach.add(new ModelChinhSach(5,"QUY ĐỊNH VỀ HỖ TRỢ SAO LƯU, CHUYỂN DỮ LIỆU CHO KHÁCH HÀNG 5",
                "I. Các trường hợp hướng dẫn sao lưu dữ liệu, chuyển dữ liệu:\n" +
                        "\tKhách hàng mua sản phẩm điện tử (Điện thoại, laptop, PC,...) tại Cửa hàng có nhu cầu sao lưu dữ liệu, chuyển dữ liệu từ thiết bị cũ sang thiết bị mới mua.\n" +
                        "\tKhách hàng mua các sản phẩm lưu trữ dữ liệu (Thẻ nhớ, USB, ổ cứng,...) tại Cửa hàng có nhu cầu chuyển dữ liệu, sao lưu dữ liệu vào sản phẩm.\n" +
                        "II. Quy định thực hiện:\n" +
                        "Khách hàng tự sao lưu, chuyển dữ liệu trên điện thoại, Laptop, PC, thiết bị ngoại vi (USB, thẻ nhớ, ổ cứng gắn ngoài).\n" +
                        "\t1.1 Sao lưu dữ liệu:\n" +
                        "\t\ta. iPhone: Khách hàng tự sao lưu bằng các hình thức sau: Sao lưu dữ liệu lên iCloud, tạo bản sao lưu dữ liệu cá nhân trên các thiết bị Laptop, PC cá nhân của khách hàng bằng iTunes.\n" +
                        "\t\tb. Android, Laptop, PC, thiết bị ngoại vi (USB, thẻ nhớ, ổ cứng gắn ngoài): Khách hàng tự sao lưu dữ liệu vào các thiết bị lưu trữ cá nhân thuộc quyền sở hữu của khách hàng, không lưu trữ trên các thiết bị thuộc quyền sở hữu của cửa hàng.\n" +
                        "\t1.2 Chuyển dữ liệu\n" +
                        "\t\ta. iPhone sang iPhone và Android sang Android: Khách hàng tự chuyển dữ liệu trực tiếp từ máy sang máy bằng công cụ của hãng hỗ trợ. Trong trường hợp không thể chuyển trực tiếp từ máy sang máy thì khách hàng thông tin qua máy tính cá nhân của khách hàng hoặc đồng bộ iCloud.\n" +
                        "\t\tb. Android sang iPhone và ngược lại:Đối với việc chuyển dữ liệu từ Android sang iPhone và từ iPhone sang Android, khách hàng tự thực hiện chuyển dữ liệu.\n" +
                        "2. Sao lưu, chuyển dữ liệu trên laptop, PC, thiết bị ngoại vi (USB, thẻ nhớ, ổ cứng gắn ngoài):\n" +
                        "\tKhách hàng tự sao lưu, chuyển dữ liệu. Nhân viên cửa hàng hỗ trợ tư vấn, giải thích những ảnh hưởng, rủi ro có thể phát sinh đối với dữ liệu như mất dữ liệu khi thực hiện cài đặt, sửa chữa, bảo hành và các dịch vụ hỗ trợ khác. Trong trường hợp khách hàng không thể tự sao lưu, chuyển dữ liệu và đồng ý cho nhân viên cửa hàng thực hiện sao lưu, chuyển dữ liệu thì khách hàng phải ký tên vào Cam kết miễn trừ trách nhiệm (theo mẫu của Công ty) với mọi rủi ro xảy ra đối với dữ liệu chuyển. Sau khi khách hàng đã ký tên, nhân viên cửa hàng được quyền thực hiện chuyển dữ liệu trên thiết bị khách hàng.\n" +
                        "\tĐối với việc chuyển dữ liệu từ Android sang iPhone và từ iPhone sang Android, trường hợp khách hàng không thể tự chuyển dữ liệu sau khi nhân viên cửa hàng đã hướng dẫn thì nhân viên cửa hàng chỉ hỗ trợ chuyển hình ảnh và danh bạ cho khách hàng, ưu tiên đồng bộ danh bạ vào Gmail khách hàng để chuyển qua thiết bị mới. Hình ảnh sẽ được sao lưu vào laptop, PC cá nhân của khách hàng để chuyển qua thiết bị mới.\n" +
                        "\tTrong trường hợp dữ liệu của khách hàng phải chuyển vào ổ cứng lưu trữ dữ liệu của cửa hàng thì nhân viên cửa hàng thông báo lại với khách hàng và chỉ được thực hiện chuyển dữ liệu vào ổ cứng lưu trữ dữ liệu của cửa hàng sau khi khách hàng đồng ý và ký vào Cam kết miễn trừ trách nhiệm (theo mẫu của Công ty) với mọi rủi ro xảy ra đối với việc chuyển dữ liệu. Nhân viên cửa hàng xóa ngay lập tức dữ liệu của khách hàng được chuyển qua ổ cứng lưu trữ dữ liệu của cửa hàng trước sự chứng kiến của khách hàng sau khi khách hàng xác nhận dữ liệu đã có đầy đủ trên thiết bị của khách hàng."));
        imgCSBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        adapterChinhSach = new AdapterChinhSach(listChinhSach,this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);

        rvChinhSach.setAdapter(adapterChinhSach);
        rvChinhSach.setLayoutManager(linearLayoutManager);
    }
}