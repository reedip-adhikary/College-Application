package in.papayacoders.plgpl.ui.about;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

import androidx.viewpager.widget.ViewPager;
import in.papayacoders.plgpl.R;


public class AboutFragment extends Fragment {

    private ViewPager viewPager;
    private BranchAdapter adapter;
    private List<BranchModel> list;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_about, container, false);

        list = new ArrayList<>();
        list.add(new BranchModel(R.drawable.ic_comp, "Computer Science", "The Department of Computer Science and Engineering fosters continuous learning and research by nurturing innovation and a state of the art learning environment to meet the global challenges. The department is keeping abreast itself of global advancements. It has well qualified, experienced and committed faculty members with the mixture of both academia and industry to provide quality industry tuned education to the students. Faculty members are contributing to make department vibrant and striving hard to achieve excellence in the area of academics and research through continuous up gradation and actively involved in the Research activities, publishing papers in peer reviewed International/National Journals and conferences."));
        list.add(new BranchModel(R.drawable.ic_mech, "Mechanical Engineering", "Established in the year 2005, the Department of Mechanical Engineering is a facility of repute supported by highly-proficient faculty, and a good student community who have all contributed to make it vibrant and achieve distinction in the areas of academics and research. It has state-of-art equipment to instill aptitude for research in faculty members and students. The faculty, alumni of several international and reputed institutes such as the University of Michigan, USA, IITs, NITs, Jadavpur, Anna University to name a few, are pro-actively involved in R&D activities leading to quality publications in national & international journals and opportunities to participate in renowned conferences. The department has a full-fledged laboratory and a fully equipped workshop complete with modern machines tools, equipment, and measuring instruments."));
        list.add(new BranchModel(R.drawable.ic_civil, "Civil Engineering", "Department of Civil Engineering has a select band of faculty who are an amalgam of rich administrative, academic, research and industry experience. Students are exposed to the state-of-the-art civil engineering practices vis-à-vis institute industry interaction, internships, field visits and in-house / on-site camps apart from the regular classroom teaching. The school has specialized laboratory facility and encourages research and consultancy. The CAD lab is sufficiently equipped with latest hardware/software and hones the skills of students in recent versions of CYPE, STAAD-PRO, AUTOCAD, MAP3D, CIVIL3D, AUTOCAD RASTERDESIGN, PRIMAVERA, MS Project, RIVET, GIS (Open Source) and GPS data manager are offered as value added programs in pursuit of making industry ready Civil Engineers."));
        list.add(new BranchModel(R.drawable.ic_aerospace, "Aerospace Engineering", "Department of Aerospace Engineering was established in the year 2009, a collaborative body between JAIN (Deemed-to-be University) and Society of Indian Aerospace Technologies & Industries (SIATI) offers engineering courses in the field of Aerospace. The department works with Jain University – Faculty of Engineering and Technology (JU-FET) to prepare the students in Aerospace Engineering for research oriented professions as well as careers related to industrial designing, problem solving and innovation in the aeronautics sector."));

        adapter = new BranchAdapter( getContext(), list);

        viewPager = view.findViewById(R.id.viewPager);

        viewPager.setAdapter(adapter);

        ImageView imageView = view.findViewById(R.id.college_image);

        Glide.with(getContext())
                .load("https://firebasestorage.googleapis.com/v0/b/jain-admin.appspot.com/o/slidingimages%2Fimg1.png?alt=media&token=670747dc-a320-487d-8681-c77a5849532e")
                .into(imageView);

        return  view;
    }
}