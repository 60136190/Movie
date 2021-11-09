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
public class CartoonFragment extends Fragment {

    private RecyclerView rcvCooking;
    private List<ItemScfi> itemScfis;
    public CartoonFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_artoon, container, false);
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
        itemScfis.add(new ItemScfi(R.drawable.coco, "Hội Ngộ Diệu Kỳ","Coco là phim 3D " +
                "của Mỹ thuộc thể loại Hoạt hình, giả tưởng, phim ca nhạc và phiêu lưu sản xuất bởi " +
                "Pixar Animation Studios và ra mắt bởi Walt Disney Pictures dựa vào ý tưởng của Lee " +
                "Unkrich, do Unkrich chỉ đạo với đồng đạo diễn và đồng tác giả Adrian Molina.\n" +
                "Ngày phát hành: 22 tháng 11, 2017 (Hoa Kỳ)\n" +
                "Đạo diễn: Adrian Molina, Lee Unkrich\n" +
                "Dựng phim: : Steve Bloom; Lee Unkrich;\n" +
                "Cốt truyện: Lee Unkrich; Adrian Molina; Jason Katz; Matthew Aldrich ","S1sBNuHyvjo"));
        itemScfis.add(new ItemScfi(R.drawable.ratatouille, "Chú Chuột Đầu Bếp","Chuột" +
                " đầu bếp là phim điện ảnh hoạt hình máy tính hài hước của Mỹ năm 2007 do Pixar sản" +
                " xuất và hãng Buena Vista Pictures Distribution chịu trách nhiệm phân phối.\n" +
                "Ngày phát hành: 29 tháng 6, 2007 (Hoa Kỳ)\n" +
                "Đạo diễn: Brad Bird\n" +
                "Cốt truyện: Jan Pinkava; Jim Capobianco; Brad Bird\n" +
                "Âm nhạc: Michael Giacchino\n" +
                "Công chiếu: 22 tháng 6, 2007 (Kodak Theatre); 29 tháng 6, 2007 (Hoa Kỳ); 9 tháng 6, 2007","pEd4T6oOp90"));
        itemScfis.add(new ItemScfi(R.drawable.up, "Vút bay","Vút bay là một bộ phim" +
                " hoạt hình máy tính được Pixar Animation Studios sản xuất và Walt Disney Pictures" +
                " phát hành. Bộ phim ra mắt khán giả vào ngày 9 tháng 5 năm 2009 tại Bắc Mỹ và là " +
                "phim hoạt hình đầu tiên khai mạc Liên hoan phim Cannes 2009. Bộ phim ra mắt khán " +
                "giả tại Anh vào ngày 9 tháng 10 năm 2009.\n" +
                "Ngày phát hành: 17 tháng 7, 2009 (Việt Nam)\n" +
                "Đạo diễn: Pete Docter\n" +
                "Bài hát nổi bật: Married Life\n" +
                "Âm nhạc: Michael Giacchino\n" +
                "Công chiếu: 29 tháng 5, 2009","Qmrhbz4dGtc"));
        itemScfis.add(new ItemScfi(R.drawable.findingnemo, "Đi Tìm Nemo","Đi tìm Nemo" +
                " là một bộ phim hoạt hình của Hoa Kỳ được công chiếu vào năm 2003. Phim do Andrew " +
                "Stanton viết kịch bản, Stanton và Lee Unkrich đạo diễn, hai hãng Walt Disney và " +
                "Pixar đồng sản xuất. Phim nói về câu chuyện của chú cá hề Marlin cùng với một con" +
                " cá khác là Dory đi tìm con trai của anh là Nemo.\n" +
                "Ngày phát hành: 30 tháng 5, 2003 (Hoa Kỳ)\n" +
                "Đạo diễn: Andrew Stanton\n" +
                "Quay phim: Sharon Calahan; Jeremy Lasky\n" +
                "Dựng phim: David Ian Salter\n" +
                "Công chiếu: 30 tháng 5 năm 2003 (Hoa Kỳ)","Qy5jelRj0GI"));
        itemScfis.add(new ItemScfi(R.drawable.songofthesea, "Khúc Ca Của Biển Cả","Song" +
                " of the Sea là một bộ phim hoạt hình giả tưởng năm 2014 do Tomm Moore đạo diễn và" +
                " đồng sản xuất, Ross Murray, Paul Young, Stephen Roelants, Serge và Marc Ume, " +
                "Isabelle Truc, Clement Calvet, Jeremie Fajner, Frederik Villumsen, và Claus Toksvig Kjaer," +
                " và được viết bởi Will Collins từ câu chuyện của Moore.\n" +
                "Xem mô tả gốc\n" +
                "Ngày phát hành: 10 tháng 7, 2015 (Ireland)\n" +
                "Đạo diễn: Tomm Moore\n" +
                "Bài hát nổi bật: Song of the Sea\n" +
                "Đề cử: Giải Oscar cho Phim Hoạt hình xuất sắc nhất, THÊM\n" +
                "Các công ty sản xuất: Cartoon Saloon, Melusine Productions","TKOfnW53t30"));

        itemScfis.add(new ItemScfi(R.drawable.insideout, "Những Mảnh Ghép Cảm Xúc","Inside Out " +
                "là bộ phim hoạt hình máy tính 3D của Mỹ được hãng phim hoạt hình Pixar sản xuất và phát" +
                " hành bởi Walt Disney Pictures. Phim do Pete Docter đạo diễn, Ronnie del Carmen đồng đạo" +
                " diễn, kịch bản do Pete Docter, Meg LeFauve và Josh Cooley viết, chuyển thể từ một câu" +
                " chuyện của Docter và Del Carmen.\n" +
                "Ngày phát hành: 19 tháng 6, 2015 (Hoa Kỳ)\n" +
                "Đạo diễn: Pete Docter\n" +
                "Dựng phim: Kevin Nolting\n" +
                "Hãng sản xuất: Pixar Animation Studios\n" +
                "Cốt truyện: : Pete Docter; Ronnie del Carmen;","TxORIABu8EA"));
        itemScfis.add(new ItemScfi(R.drawable.demonslayer, "Thanh Gươm Diệt Quỷ","Kimetsu no Yaiba " +
                "là một bộ manga Nhật Bản của tác giả Gotōge Koyoharu. Bộ manga này đã được đăng theo kỳ" +
                " trên Weekly Shōnen Jump từ số phát hành tháng 2 năm 2016 đến tháng 5 năm 2020 và sau đó" +
                " các chương truyện được tổng hợp đưa vào 21 cuốn tankōbon.\n" +
                "Tác giả: Gotouge Koyoharu\n" +
                "Nhân vật chính: Kamado Tanjiro","dENOu5W5m5Q"));
        itemScfis.add(new ItemScfi(R.drawable.frozen, "Nữ Hoàng Băng Giá 1","Frozen là câu " +
                "chuyện về cuộc hành trình tìm kiếm người chị Elsa - một nữ hoàng băng giá của công chúa " +
                "Anna, anh chàng miền núi Krisoff, chú tuần lộc Sven và người tuyết Olaf.. Có thể nhiều " +
                "người sẽ ao ước sở hữu phép thuật, song đó chắc chắn không phải nàng công chúa Elsa.\n" +
                "\n" +
                "Nữ Hoàng Băng Giá | Frozen | phim thiếu nhi | VieONhttps://vieon.vn › nu-hoang-bang-gia\n" +
                "Nhân vật: Elsa, Anna, Olaf, Kristoff, Hans, Oaken, Gothi - Troll Priest, THÊM\n" +
                "Các đạo diễn: Chris Buck, Jennifer Lee, Stevie Wermers, Kevin Deters","xt_q-ek2r7A"));
        itemScfis.add(new ItemScfi(R.drawable.spiritedaway, "Vùng Đất Linh Hồn","Sen và Chihiro " +
                "ở thế giới thần bí là một bộ phim điện ảnh hoạt hình Nhật Bản đề tài tuổi mới lớn và kỳ ảo công" +
                " chiếu năm 2001 do Miyazaki Hayao làm đạo diễn kiêm nhà biên kịch.\n" +
                "Ngày phát hành: 20 tháng 7, 2001 (Nhật Bản)\n" +
                "Đạo diễn: Miyazaki Hayao\n" +
                "Tiếng Nhật: 千と千尋の神隠し\n" +
                "Quay phim: Okui Atsushi\n" +
                "Giải thưởng: Giải Oscar cho Phim Hoạt hình xuất sắc nhất","MQOYN51V3WE"));
        itemScfis.add(new ItemScfi(R.drawable.tangled, "Người Đẹp Tóc Mây","Người đẹp tóc " +
                "mây là một bộ phim điện ảnh hoạt hình máy tính 3D thuộc thể loại nhạc kịch và phiêu lưu " +
                "của Mỹ năm 2010 do xưởng phim Walt Disney Animation Studios sản xuất và hãng Walt Disney" +
                " Pictures chịu trách nhiệm phát hành.\n" +
                "Ngày phát hành: 28 tháng 1, 2011 (Việt Nam)\n" +
                "Đạo diễn: Nathan Greno, Byron Howard\n" +
                "Phỏng theo: Rapunzel\n" +
                "Dựng phim: Tim Mertens","ru_zkEN3cMA"));
        itemScfis.add(new ItemScfi(R.drawable.doraemon, "Doraemon","Doraemon là nhân " +
                "vật chính hư cấu trong loạt Manga cùng tên của họa sĩ Fujiko F. Fujio. Trong truyện" +
                " lấy bối cảnh ở thế kỷ 22, Doraemon là chú mèo robot của tương lai do xưởng" +
                " Matsushiba — công xưởng chuyên sản xuất robot vốn dĩ nhằm mục đích chăm sóc trẻ nhỏ. \n" +
                "Người tạo: Fujiko Fujio\n" +
                "Chiều cao: 129,3 cm\n" +
                "Sở thích: Ăn bánh Dorayaki\n" +
                "Biệt danh: Mèo Ú (người thân); Chồn Con (bà của Nobita); Chồn Xanh (người lạ)","q2o3UZCBg7w"));
        itemScfis.add(new ItemScfi(R.drawable.pokemon, "Pokemon 228","Pokémon hay còn được" +
                " biết với tên trong tiếng Nhật là Pocket Monsters là một loạt phim hoạt hình được " +
                "phát sóng trên truyền hình tại Nhật Bản từ ngày 1 tháng 4 năm 1997 trên TV Tokyo.\n" +
                "Tập cuối: 21 tháng 1, 1999\n" +
                "Phát sóng: 1 tháng 4 năm 1997 – nay\n" +
                "Kịch bản: Takeshi Shudo (1997–2000); Atsuhiro Tomioka (2006–2016); Aya Matsui (2016–nay)\n" +
                "Kênh gốc: TV Tokyo","h9aaxzWb938"));
    }
}