package Myapp.movie;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class MusicFragment extends Fragment {



    private RecyclerView rcvCooking;
    private List<ItemScfi> itemScfis;
    public MusicFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_music, container, false);
        rcvCooking = view.findViewById(R.id.rcv_cooking);
        ItemScfiAdappter itemScfiAdappter = new ItemScfiAdappter(getContext(), itemScfis);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);
        rcvCooking.setLayoutManager(gridLayoutManager);
        rcvCooking.setAdapter(itemScfiAdappter);
        return view;

    }
        @Override
        public void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            itemScfis = new ArrayList<>();
            itemScfis.add(new ItemScfi(R.drawable.plhugo1, "Đen-Trốn Tìm ft.MTV band",
                    "Trốn Tìm (Hide and Seek)\n" +
                            "Download/Stream: https://Denvau.lnk.to/TronTim\n" +
                            "Performed by MTV band and Đen\n" +
                            "Director: Ong DONG & Ba HUONG\n" +
                            "Written by DENVAU\n" +
                            "Music Produced by LỒNG ĐÈN\n" +
                            "Arranger: TRAN HAU\n" +
                            "Instrumentals : TRAN HAU (Drumset, Percussion, Piano, Melodica)," +
                            " DANH TU (Guitar Acoustic, Guitar Bass)\n" +
                            "Record/Mix/Master: TRAN HAU (24BeatsProduction)\n" +
                            "Support: BIEN, CHENG, JACK TRAN","Ws-QlpSltr8"));
            itemScfis.add(new ItemScfi(R.drawable.pl2, "SƠN TÙNG M-TP | MUỘN RỒI MÀ SAO CÒN",
                    "Executive Producer: Nguyen Thanh Tung\n" +
                    "Composer: Son Tung M-TP \n" +
                    "Music Producer: Son Tung M-TP \n" +
                    "Artist: Son Tung M-TP \n" +
                    "Executive Supervisor: Chau LE\n" +
                    "Project Manager: M-TP Talent | A member of M-TP Entertainment \n" +
                    "Project Marketing: Henry Nguyen\n" +
                    "Unit Production Manager: Mr. Blue \n" +
                    "Digital Team: Tu Le\n" +
                    "Partnership Management: Jodie Nguyen, Trang Nguyen\n" +
                    "Admin and Support: Thanh Ha, Viet Nguyen, Hoang Nguyen, Bao Truong, Bich Tran, Hung Dang,Nhi Do\n" +
                    "Securities: Vo Duong Ngoc Hoa ","xypzmu5mMPY"));
            itemScfis.add(new ItemScfi(R.drawable.pl3, "Đen-Trời hôm nay nhiều mây cực",
                    "Chú ý: Cảnh quay trên máy bay trực thăng được thực hiện với các biện " +
                            "pháp an toàn đúng theo quy định hiện hành và dưới sự giám sát của Cơ " +
                            "trưởng chuyến bay; không nên làm theo khi chưa có sự chấp thuận của " +
                            "hãng bay và Cơ trưởng chuyến bay. Cảm ơn sự hỗ trợ nhiệt tình của đội " +
                            "bay Bell 505!\n" +
                            "\n" +
                            "Prod. Chi Phong Madihu\n" +
                            "Record: 14record\n" +
                            "Mix/master: A.N production","BHCU7CR_Unk"));
            itemScfis.add(new ItemScfi(R.drawable.pl4, "Kimmese-Loving You Sunny ft. Đen",
                    "Performed by Kimmese, Đen\n" +
                            "Prod. by Touliver\n" +
                            "Special Thanks to Glowing Studio, Moov, SpaceSpeakers, JustaTee, " +
                            "Rhymastic, Touliver, Đen, Anna Constanza De. Keulenaar\n" +
                            "\n" +
                            "Directed by: Tran Hong Loc Dinh\n" +
                            "Animated director: To Duong Phuong Nguyen \n" +
                            "#Kimmese #LovingYouSunny #Đen","GjSi4OxJORY"));
            itemScfis.add(new ItemScfi(R.drawable.pl5, "Thanh Xuân - Da LAB",
                    "Thanh Xuân\n" +
                            "Sáng tác và trình bày: Da LAB\n" +
                            "Phối khí: Krax\n" +
                            "Thu âm, mix và master: Phòng thu SOS\n" +
                            "Hình ảnh sản xuất bởi ForArt Film Production\n" +
                            "Hai nhà tài trợ đồng hành: Ford và Biti's Hunter\n" +
                            "Một sản phẩm của Sony Music Entertainment HK\n" +
                            "#ThanhXuanDaLAB #DaLAB #SMEVN","GgQFO8dL5XQ"));
            itemScfis.add(new ItemScfi(R.drawable.pl6, "","Calum Scott-You Are The Reason" +
                    "là một bộ phim khoa học viễn tưởng của Mỹ năm 2009 do James Cameron viết kịch bản" +
                    " và đạo diễn, với sự tham gia của các diễn viên Sam Worthington, Zoe Saldana," +
                    " Stephen Lang, Michelle Rodriguez, Joel David Moore, Giovanni Ribisi và Sigourney" +
                    " Weaver.\n" +
                    "Ngày phát hành: 17 tháng 12, 2009 (Vương Quốc Anh)\n" +
                    "Đạo diễn: James Cameron\n" +
                    "Dựng phim: James Cameron; John Refoua; Stephen E. Rivkin\n" +
                    "Doanh thu: 2.787.965.087 đô la Mỹ\n" +
                    "Quay phim: Mauro Fiore\n" +
                    "Các nhà sản xuất: James Cameron, Jon Landau","ShZ978fBl6Y"));
            itemScfis.add(new ItemScfi(R.drawable.pl7, "Alec Benjamin-Let Me Down Slowly",
                    "Shop 'These Two Windows' merch: https://alecbenjamin.store\n" +
                            "\n" +
                            "'Narrated For You' available now: https://lnk.to/NarratedForYouID\n" +
                            "\n" +
                            "Director: Matt Swinsky","50VNCymT-Cs"));
    }
}