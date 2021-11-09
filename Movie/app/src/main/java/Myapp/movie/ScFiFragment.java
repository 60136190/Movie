package Myapp.movie;


import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;


/**
 * A simple {@link Fragment} subclass.
 */
public class ScFiFragment extends Fragment {

     private RecyclerView rcvCooking;
     private List<ItemScfi> itemScfis;
//     ItemScfiAdappter mItemScfiAdappter;
    public ScFiFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = (RelativeLayout) inflater.inflate(R.layout.fragment_scfi, container, false);
        rcvCooking = view.findViewById(R.id.rcv_cooking);
        ItemScfiAdappter itemScfiAdappter = new ItemScfiAdappter(getContext(),itemScfis);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);
        rcvCooking.setLayoutManager(gridLayoutManager);
        rcvCooking.setAdapter(itemScfiAdappter);
       return view;
    }



    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        itemScfis = new ArrayList<>();
        itemScfis.add(new ItemScfi(R.drawable.aquaman,"Aquaman","Aquaman: Đế vương Atlantis " +
                "là phim điện ảnh siêu anh hùng của Mỹ dựa trên nhân vật Aquaman của DC Comics. Đây là phim" +
                "thứ sáu của DC Extended Universe, do James Wan đảm nhiệm vai trò đạo diễn, David Leslie " +
                "Johnson-McGoldrick và Will Beall thực hiện phần kịch bản từ phần cốt truyện của Wan, Beall " +
                "và Geoff Johns.","hAgOrpqzN4Y"));
        itemScfis.add(new ItemScfi(R.drawable.avengers,"Avengers End game","Avengers: Hồi kết là " +
                "phim điện ảnh siêu anh hùng Mỹ ra mắt năm 2019, do Marvel Studios sản xuất và Walt Disney Studios " +
                "Motion Pictures phân phối.\n" +
                "Ngày phát hành: 26 tháng 4, 2019 (Hoa Kỳ)\n" +
                "Phòng vé: 2,798 tỷ USD\n" +
                "Phỏng theo: Avengers\n" +
                "Doanh thu: 2,798 tỷ USD\n" +
                "Quay phim: Trent Opaloch","Bhm2YXwiwnY"));
        itemScfis.add(new ItemScfi(R.drawable.blackpanther,"Black Panther","Black Panther: Chiến" +
                " binh Báo Đen là một phim của điện ảnh Hoa Kỳ dựa trên nhân vật siêu anh hùng cùng tên của hãng " +
                "Marvel Comics, sản xuất bởi Marvel Studios và phân phối bởi Walt Disney Studios Motion Pictures.\n" +
                "Ngày phát hành: 16 tháng 2, 2018 (Hoa Kỳ)\n" +
                "Đạo diễn: Ryan Coogler\n" +
                "Quay phim: Rachel Morrison\n" +
                "Dựng phim: Michael P. Shawver; Claudia Castello\n" +
                "Quốc gia: Hoa Kỳ","APwecL1rqwQ"));
        itemScfis.add(new ItemScfi(R.drawable.captainamerica,"Captain America","Captain America là" +
                " một siêu anh hùng hư cấu xuất hiện trong truyện tranh của Hoa Kỳ được xuất bản bởi Marvel Comics." +
                " Được tạo bởi họa sĩ truyện tranh Joe Simon và Jack Kirby, nhân vật lần đầu tiên xuất hiện trong" +
                " Captain America Comics # 1 từ Timely Comics, tiền thân của Marvel Comics.","DxX0Bhuzjbg"));
        itemScfis.add(new ItemScfi(R.drawable.captainmarvel,"Captain Marvel","Đại uý Marvel " +
                "(tên gốc tiếng Anh: Captain Marvel) là một phim siêu anh hùng ra mắt năm 2019 của Mỹ dựa trên " +
                "nhân vật Carol Danvers của truyện tranh Marvel.\n" +
                "Quay phim: Ben Davis\n" +
                "Diễn viên: Brie Larson\n" +
                "Dựng phim: Elliot Graham; Debbie Berman\n" +
                "Đạo diễn: Anna Boden; Ryan Fleck","vqFewp5n9pc"));
        itemScfis.add(new ItemScfi(R.drawable.godzilla,"Godzilla","Godzilla thường được mệnh danh " +
                "là \"King of the Monsters\" (\"vua của các loài quái vật\"), một cụm từ được sử dụng lần đầu" +
                " tiên trong bộ phim Godzilla, King of the Monsters! (1956), phiên bản chuyển thể của Hoa Kỳ dựa " +
                "trên bộ phim gốc năm 1954","PumvXZFRKLM"));
        itemScfis.add(new ItemScfi(R.drawable.spidermanfarfromhome,"Spiderman far from home","Người Nhện" +
                " xa nhà là phim siêu anh hùng năm 2019 của Mỹ dựa trên nhân vật Peter Parker của Marvel Comics, do " +
                "Columbia Pictures và Marvel Studios đồng sản xuất và Sony Pictures Releasing phân phối. Phim là phần" +
                " tiếp theo của Người Nhện: Trở về nhà, đồng thời là phim điện ảnh thứ hai mươi ba của Vũ trụ Điện ảnh Marvel.\n" +
                "Ngày phát hành: 2 tháng 7, 2019 (Hoa Kỳ)\n" +
                "Đạo diễn: Jon Watts\n" +
                "Doanh thu: $1.132 tỉ\n" +
                "Phát hành: Sony Pictures Releasing\n" +
                "Quay phim: Matthew J. Lloyd\n" +
                "Dựng phim: Dan Lebental; Leigh Folsom-Boyd","04NzR3sdxDs"));
        itemScfis.add(new ItemScfi(R.drawable.thesilence,"The Silence","Được dịch từ tiếng Anh-The Silence" +
                " là một bộ phim kinh dị năm 2019 của đạo diễn John R. Leonetti và có sự tham gia của Kiernan Shipka, " +
                "Stanley Tucci, Miranda Otto và John Corbett. Kịch bản của Carey và Shane Van Dyke điều chỉnh cuốn tiểu" +
                " thuyết kinh dị cùng tên năm 2015 của Tim Lebbon.(tiếng Anh)\n" +
                "Xem mô tả gốc\n" +
                "Ngày phát hành: 16 tháng 5, 2019 (Đức)\n" +
                "Đạo diễn: John R. Leonetti\n" +
                "Phỏng theo: The Silence","Y-ufZuqTd5c"));
        itemScfis.add(new ItemScfi(R.drawable.thetomorrowwar,"The Tomorrow War","Cuộc chiến tương lai là bộ" +
                " phim hành động khoa học viễn tưởng chiến tranh của Mỹ, sản xuất năm 2021 do Chris McKay đạo diễn, phụ trách" +
                " hình ảnh do David Ellison, Dana Goldberg, Don Granger, David S. Goyer, Jules Daly và Adam Kolbrenner sản xuất, " +
                "với kịch bản được viết bởi Zach Dean.\n" +
                "Ngày phát hành ban đầu: 2 tháng 7, 2021\n" +
                "Đạo diễn: Chris McKay\n" +
                "Sản xuất: David Ellison; Dana Goldberg; Don Granger; David S. Goyer; Adam Kolbrenner; Jules Daly\n" +
                "Tác giả kịch bản: Zach Dean\n" +
                "Các công ty sản xuất: Skydance Media","LwGUPMPyYCE"));
        itemScfis.add(new ItemScfi(R.drawable.thorragnarok,"Thor Rangnarok 1","Thor: Tận thế Ragnarok là một " +
                "bộ phim siêu anh hùng ra mắt vào năm 2017 của Mỹ do Marvel Studios sản xuất và Walt Disney Studios Motion" +
                " Pictures phân phối. Bộ phim là phần tiếp theo của Thor và Thor: The Dark World và là bộ phim thứ mười bảy " +
                "trong Vũ trụ Điện ảnh Marvel.\n" +
                "Ngày phát hành: 3 tháng 11, 2017 (Hoa Kỳ)\n" +
                "Đạo diễn: Taika Waititi\n" +
                "Dựng phim: Joel Negron; Zene Baker\n" +
                "Quay phim: Javier Aguirresarobe\n" +
                "Phát hành: Walt Disney Studios; Motion Pictures\n" +
                "Doanh thu: $853,9 triệu","jnJZbAizxyY"));
        itemScfis.add(new ItemScfi(R.drawable.godzillakong,"Godzilla Kong","Godzilla đại chiến Kong là" +
                "phim điện ảnh quái vật của Mỹ năm 2021 do Adam Wingard đạo diễn. Đây là phần tiếp theo của Chúa tể" +
                " Godzilla và Kong: Đảo Đầu lâu, đồng thời cũng là phim điện ảnh thứ tư trong vũ trụ điện ảnh MonsterVerse " +
                "của hãng Legendary.\n" +
                "Ngày phát hành: 26 tháng 3, 2021 (Việt Nam)\n" +
                "Đạo diễn: Adam Wingard\n" +
                "Quay phim: Ben Seresin\n" +
                "Doanh thu: 441,7 triệu USD\n" +
                "Dựng phim: Josh Schaeffer","uOrpf6bYK2Q"));
        itemScfis.add(new ItemScfi(R.drawable.hulk,"Hulk","The Incredible Hulk là một bộ phim siêu anh" +
                " hùng dựa trên nhân vật Hulk của Marvel Comics, do Marvel Studios sản xuất và Universal Pictures phân phối." +
                " Đây là bộ phim thứ hai trong Vũ trụ phim siêu anh hùng Marvel. Phim do Louis Leterrier đạo diễn với kịch" +
                " bản của Zak Penn.\n" +
                "Ngày phát hành: 13 tháng 6, 2008 (Hoa Kỳ)\n" +
                "Đạo diễn: Louis Leterrier\n" +
                "Loạt phim: Người khổng lồ xanh\n" +
                "Dựng phim: John Wright; Rick Shaine; Vincent Tabaillon\n" +
                "Quay phim: Peter Menzies Jr.\n" +
                "Hãng sản xuất: Marvel Studios; Valhalla Motion Pictures","-IZ1QlSsefc"));
        itemScfis.add(new ItemScfi(R.drawable.mazerunner,"Maze Runner","Giải mã mê cung là một bộ phim " +
                "hành động khoa học viễn tưởng Mỹ năm 2014 của đạo diễn Wes Ball dựa trên cuốn sách cùng tên xuất bản năm" +
                " 2009 của James Dashner. Các diễn viên chính trong phim bao gồm Dylan O'Brien, Kaya Scodelario," +
                " Thomas Brodie-Sangster và Will Poulter.\n" +
                "Ngày phát hành: 19 tháng 9, 2014 (Hoa Kỳ)\n" +
                "Đạo diễn: Wes Ball\n" +
                "Loạt phim: Giải mã mê cung\n" +
                "Dựng phim: Dan Zimmerman\n" +
                "Phỏng theo: Giải mã mê cung\n" +
                "Quay phim: Enrique Chediak","IJ6F4jOuRx4"));
        itemScfis.add(new ItemScfi(R.drawable.realplayerone,"Real Player One","Ready Player One: Đấu trường" +
                " ảo là một bộ phim điện ảnh đề tài phiêu lưu và khoa học viễn tưởng được công chiếu vào năm 2018 do Steven" +
                " Spielberg sản xuất kiêm đạo diễn, với phần kịch bản được chắp bút bởi Zak Penn và Ernest Cline, dựa trên " +
                "cuốn tiểu thuyết cùng tên năm 2011 của Cline.\n" +
                "Ngày phát hành: 29 tháng 3, 2018 (Hoa Kỳ)\n" +
                "Đạo diễn: Steven Spielberg\n" +
                "Quay phim: Janusz Kamiński\n" +
                "Dựng phim: Michael Kahn; Sarah Broshar\n" +
                "Doanh thu: 582,9 triệu USD\n" +
                "Công chiếu: 11 tháng 3, 2018 (SXSW); 29 tháng 3, 2018 (Mỹ); 30 tháng 3, 2018 (Việt Nam)","9lv0NAXqfTQ"));
        itemScfis.add(new ItemScfi(R.drawable.adastra,"AD Astra","Giải mã bí ẩn Ngân Hà là phim điện " +
                "ảnh khoa học viễn tưởng của Mỹ năm 2019 do James Gray sản xuất, đồng biên kịch và đạo diễn. Wikipedia\n" +
                "Ngày phát hành: 20 tháng 9, 2019 (Hoa Kỳ)\n" +
                "Đạo diễn: James Gray\n" +
                "Quay phim: Hoyte van Hoytema\n" +
                "Dựng phim: John Axelrad; Lee Haugen\n" +
                "Phát hành: 20th Century Fox\n" +
                "Âm nhạc: Max Richter","NkCfC_XHTa4"));

    }
}
