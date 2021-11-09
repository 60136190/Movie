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


/**
 * A simple {@link Fragment} subclass.
 */
public class RomanticFragment extends Fragment {


    private RecyclerView rcvCooking;
    private List<ItemScfi> itemScfis;
    public RomanticFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_romantic, container, false);
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
        itemScfis.add(new ItemScfi(R.drawable.rm1, "A RAINY DAY IN NEW YORK ",
                "Chuyện ngày mưa ở New York là một bộ phim hài-lãng mạn Mỹ năm 2019 do Woody" +
                        " Allen đạo diễn kiêm viết kịch bản, có sự tham gia diễn xuất của Timothée " +
                        "Chalamet, Elle Fanning, Selena Gomez, Jude Law, Diego Luna và Liev Schreiber.\n" +
                "Ngày phát hành ban đầu: 26 tháng 7, 2019\n" +
                "Đạo diễn: Woody Allen\n" +
                "Dựng phim: Alisa Lepselter\n" +
                "Quay phim: Vittorio Storaro\n" +
                "Quốc gia: Hoa Kỳ\n" +
                "Công chiếu: 26 tháng 7, 2019 (Ba Lan); 18 tháng 10, 2019 (Việt Nam)","yIVRldiVDL8"));
        itemScfis.add(new ItemScfi(R.drawable.rm2, "A FAITHFUL MAN",
                "Được dịch từ tiếng Anh-A Faithful Man là một bộ phim hài kịch lãng " +
                        "mạn của Pháp năm 2018 của đạo diễn Louis Garrel, từ một kịch bản của" +
                        " Garrel và Jean-Claude Carrière. Phim có sự tham gia của Laetitia Casta, " +
                        "Lily-Rose Depp, Joseph Engel và Garrel.(tiếng Anh)\n" +
                "Xem mô tả gốc\n" +
                "Ngày phát hành: 26 tháng 12, 2018 (Pháp)\n" +
                "Đạo diễn: Louis Garrel\n" +
                "Đề cử: Giải César cho Nữ diễn viên triển vọng nhất, TIFF Awards: Transilvania Trophy, TIFF Awards: Special Jury Award\n" +
                "Tác giả kịch bản: Louis Garrel, Jean-Claude Carrière","UDaYckxMgpM"));
        itemScfis.add(new ItemScfi(R.drawable.rm3, "DELIBAL",
                "Ngày phát hành: 25 tháng 12, 2015 (Thổ Nhĩ Kỳ)\n" +
                "Đạo diễn: Ali Bilgin","_A-k9FYBF5g"));
        itemScfis.add(new ItemScfi(R.drawable.rm4, "FIVE FEET APART",
                "Được dịch từ tiếng Anh-Five feet Apart là một bộ phim tình cảm lãng mạn" +
                        " Mỹ năm 2019 của đạo diễn Justin Baldoni và được viết bởi Mikki Daughtry" +
                        " và Tobias Iaconis. Bộ phim được lấy cảm hứng từ Claire Wineland, " +
                        "người bị xơ nang.\n" +
                "Xem mô tả gốc\n" +
                "Ngày phát hành: 15 tháng 3, 2019 (Hoa Kỳ)\n" +
                "Đạo diễn: Justin Baldoni","UjnDpcgJXvA"));
        itemScfis.add(new ItemScfi(R.drawable.rm5, "THE SENSE OF WONDER",
                "Được dịch từ tiếng Anh-The Sense of Wonder là một bộ phim lãng mạn Pháp" +
                        " năm 2015 được viết và đạo diễn bởi Éric Besnard. Phim có sự tham gia " +
                        "của Virginie Efira và Benjamin Lavernhe.\n" +
                "Xem mô tả gốc\n" +
                "Ngày phát hành: 16 tháng 12, 2015 (Pháp)\n" +
                "Đạo diễn: Eric Besnard","GD0W-2IvFUE"));
        itemScfis.add(new ItemScfi(R.drawable.rm6, "THE MOUNTAIN BETWEEN US",
                "Được dịch từ tiếng Anh-The Mountain Between Us là một bộ phim chính " +
                        "kịch Mỹ năm 2017 do Hany Abu-Assad đạo diễn và Chris Weitz và J." +
                        " Mills Goodloe viết kịch bản, dựa trên tiểu thuyết cùng tên năm 2011" +
                        " của Charles Martin.\n" +
                "Xem mô tả gốc\n" +
                "Ngày phát hành: 6 tháng 10, 2017 (Hoa Kỳ)\n" +
                "Đạo diễn: Hany Abu-Assad\n" +
                "Phỏng theo: The Mountain Between Us\n" +
                "Ngân sách: 35 triệu USD","Mu41hu1a_8c"));
        itemScfis.add(new ItemScfi(R.drawable.rm7, "HOT SUMMER NIGHTS",
                "Hot Summer Nights là một phim điện ảnh chính kịch thể loại neo-noir," +
                        " tội phạm, tuổi mới lớn Mỹ năm 2017 do Elijah Bynum đạo diễn kiêm " +
                        "viết kịch bản, cũng là tác phẩm điện ảnh đầu tay của anh.\n" +
                "Ngày phát hành: 27 tháng 7, 2018 (Hoa Kỳ)\n" +
                "Đạo diễn: Elijah Bynum\n" +
                "Quay phim: Javier Juliá\n" +
                "Dựng phim: Jeffrey J. Castelluccio; Dan Zimmerman; Tom Costantino\n" +
                "Doanh thu: 244.331 USD\n" +
                "Quốc gia: Hoa Kỳ","M2nWr1jwPK4"));

    }

    }
