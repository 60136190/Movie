package Myapp.movie;

import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class AdventureFragment extends Fragment {

    private RecyclerView rcvCooking;
    private List<ItemScfi> itemScfis;

    public AdventureFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_adventure, container, false);
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
        itemScfis.add(new ItemScfi(R.drawable.plhugo1, "Cuộc phiêu lưu của Hugo",
                "Hugo là một bộ phim điện ảnh lịch sử thể loại phiêu lưu dưới định dg 3D, " +
                        "được đạo diễn và đồng sản xuất bởi đạo diễn lừng danh Martin Scorsese.\n" +
                "Ngày phát hành: 23 tháng 11, 2011 (Hoa Kỳ)\n" +
                "Đạo diễn: Martin Scorsese\n" +
                "Phỏng theo: The Invention of Hugo Cabret\n" +
                "Dựng phim: Thelma Schoonmaker\n" +
                "Đề cử: Giải Oscar cho Thiết kế sản xuất xuất sắc nhất.\n" +
                "Giải thưởng: Giải Oscar cho Thiết kế sản xuất xuất sắc nhất","wKA2147lxIM"));
        itemScfis.add(new ItemScfi(R.drawable.pl2, "Võ Sĩ Giác Đấu","Gladiator " +
                "là một bộ phim sử thi lịch sử của Mỹ phát hành năm 2000 của đạo diễn Ridley Scott," +
                " với sự tham gia của Russell Crowe, Joaquin Phoenix, Connie Nielsen, Ralf Möller," +
                " Oliver Reed, Djimon Hounsou, Derek Jacobi, John Shrapnel, và Richard Harris.\n" +
                "Ngày phát hành: 5 tháng 5, 2000 (Hoa Kỳ)\n" +
                "Đạo diễn: Ridley Scott\n" +
                "Cốt truyện: David Franzoni\n" +
                "Âm nhạc: Hans Zimmer; Lisa Gerrard; Klaus Badelt\n" +
                "Doanh thu: $457,640,427\n" +
                "Giải thưởng: Giải Oscar cho Nam diễn viên chính xuất sắc nhất.","QKE3MlqiqrE"));
        itemScfis.add(new ItemScfi(R.drawable.pl3, "Sòng Bạc Hoàng Gia",
                "Sòng bạc hoàng gia là phim điện ảnh đề tài gián điệp của Vương quốc " +
                        "Anh công chiếu năm 2006, và là phần thứ 21 trong loạt phim điện ảnh " +
                        "James Bond của Eon Productions và bản chuyển thể màn ảnh lần thứ ba từ" +
                        " cuốn tiểu thuyết cùng tên năm 1963 của nhà văn Ian Fleming .\n" +
                "Ngày phát hành: 16 tháng 11, 2006 (Séc)\n" +
                "Đạo diễn: Martin Campbell\n" +
                "Bài hát nổi bật: You Know My Name\n" +
                "Dựng phim: Stuart Baird\n" +
                "Phỏng theo: Casino Royale\n" +
                "Quay phim: Phil Meheux","ILXsDix4t54"));
        itemScfis.add(new ItemScfi(R.drawable.pl4, "Cuộc đời của Pi",
                "Life of Pi là một bộ phim 3D live-action/computer-animated, của Mỹ năm 2012," +
                        " thuộc thể loại phiêu lưu, tâm lý được David Magee chuyển thể kịch bản " +
                        "từ tiểu thuyết cùng tên của Yann Martel do Lý An đạo diễn cùng các diễn" +
                        " viên Suraj Sharma, Irrfan Khan, Rafe Spall, Gérard Depardieu, Tabu, " +
                        "và Adil Hussain.\n" +
                "Ngày phát hành: 14 tháng 12, 2012 (Việt Nam)\n" +
                "Đạo diễn: Lý An\n" +
                "Phỏng theo: Cuộc đời của Pi\n" +
                "Dựa trên: Life of Pi; của Yann Martel\n" +
                "Giải thưởng: Giải Oscar cho Nhạc phim xuất sắc nhất","sxiFAIlluQY"));
        itemScfis.add(new ItemScfi(R.drawable.pl5, "Kẻ Đánh Cắp Giấc Mơ",
                "Inception là một bộ phim điện ảnh hành động khoa học viễn tưởng " +
                        "Mỹ ra mắt năm 2010 do Christopher Nolan đạo diễn kiêm nhà sản xuất " +
                        "và viết kịch bản.\n" +
                "Ngày phát hành: 6 tháng 8, 2010 (Việt Nam)\n" +
                "Đạo diễn: Christopher Nolan\n" +
                "Công chiếu: 8 tháng 7, 2010 (Công chiếu tại London); 16 tháng 7, 2010 (Hoa Kỳ)\n" +
                "Quay phim: Wally Pfister\n" +
                "Hãng sản xuất: Legendary Pictures; Syncopy Films\n" +
                "Giải thưởng: Giải Điện ảnh của MTV cho Diễn xuất đáng kinh sợ nhất","Jk8smmU-uPk"));
        itemScfis.add(new ItemScfi(R.drawable.pl6, "Thế Thân - Avatar","Avatar " +
                "là một bộ phim khoa học viễn tưởng của Mỹ năm 2009 do James Cameron viết kịch bản" +
                " và đạo diễn, với sự tham gia của các diễn viên Sam Worthington, Zoe Saldana," +
                " Stephen Lang, Michelle Rodriguez, Joel David Moore, Giovanni Ribisi và Sigourney" +
                " Weaver.\n" +
                "Ngày phát hành: 17 tháng 12, 2009 (Vương Quốc Anh)\n" +
                "Đạo diễn: James Cameron\n" +
                "Dựng phim: James Cameron; John Refoua; Stephen E. Rivkin\n" +
                "Doanh thu: 2.787.965.087 đô la Mỹ\n" +
                "Quay phim: Mauro Fiore\n" +
                "Các nhà sản xuất: James Cameron, Jon Landau","9H8CjHTNCtg"));
        itemScfis.add(new ItemScfi(R.drawable.pl7, "Cá Lớn - Big Fish",
                "Big Fish là một bộ phim chính kịch giả tưởng của Mỹ năm 2003 dựa trên cuốn " +
                        "tiểu thuyết cùng tên năm 1998 của Daniel Wallace. Bộ phim được đạo diễn bởi" +
                        " Tim Burton và dàn diễn viên bao gồm Ewan McGregor, Albert Finney, " +
                        "Billy Crudup, Jessica Lange, và Marion Cotillard.\n" +
                "Ngày phát hành: 25 tháng 12, 2003 (Hoa Kỳ)\n" +
                "Đạo diễn: Tim Burton\n" +
                "Phỏng theo: Big Fish: A Novel of Mythic Proportions\n" +
                "Dựng phim: Chris Lebenzon\n" +
                "Quay phim: Philippe Rousselot\n" +
                "Đề cử: Giải Oscar cho Nhạc phim xuất sắc nhất","c_SY-_awHN0"));
    }
}
