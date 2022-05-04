package com.example.anyangstagram;

/**
 * Created by 문경태 on 2018-06-19.
 */

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapActivity extends Activity implements OnMapReadyCallback {

    /*
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map_activity);
    }*/

    private GoogleMap gMap;
    MapFragment mapFrag;
    private Marker mSungkyul, mBungye, mBungye1, mBungye2, mBungye3, mBungye4, mBungye5, mBungye6, mBungye7 , mBungye8;
    private Marker mBungye9, mBungye10, mBungye11, mBungye12, mBungye13, mBungye14, mBungye15, mBungye16, mBungye17;
    private Marker mBungye18, mBungye19, mBungye20, mBungye21, mBungye22, mBungye23, mBungye24, mBungye25, mBungye26, mBungye27;
    private Marker mBungye28, mBungye29, mBungye30, mBungye31, mBungye32, mBungye33, mBungye34, mBungye35;
    private Marker mAnyang, mAnyang1, mAnyang2, mAnyang3, mAnyang4, mAnyang5, mAnyang6, mAnyang7, mAnyang8, mAnyang9 , mAnyang10, mAnyang11, mAnyang12;
    private Marker mAnyang13, mAnyang14, mAnyang15, mAnyang16, mAnyang17, mAnyang18, mAnyang19, mAnyang20, mAnyang21, mAnyang22, mAnyang23, mAnyang24, mAnyang25, mAnyang26, mAnyang27;
    private Marker mAnyang28, mAnyang29, mAnyang30, mAnyang31, mAnyang32, mAnyang33, mAnyang34, mAnyang35, mAnyang36, mAnyang37, mAnyang38, mAnyang39, mAnyang40;
    private Marker mAnyang41, mAnyang42, mAnyang43, mAnyang44, mAnyang45, mAnyang46;
    private Marker /*mSungkyul1, */mSungkyul2, mSungkyul3, mSungkyul4, mSungkyul5, mSungkyul6, mSungkyul7, mSungkyul8, mSungkyul9, mSungkyul10, mSungkyul11, mSungkyul12;
    private Marker mSungkyul13, mSungkyul14, mSungkyul15, mSungkyul16, mSungkyul17,  mSungkyul20, mSungkyul21, mSungkyul22, mSungkyul23;
    private Marker mSungkyul24, mSungkyul25, mSungkyul26, mSungkyul27, mSungkyul28, mSungkyul29, mSungkyul30;
    private Marker mAdd1, mAdd2, mAdd3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map_activity);
        setTitle("                       음식점 위치");
        mapFrag = (MapFragment) getFragmentManager().findFragmentById(R.id.map);
        mapFrag.getMapAsync(this);
    }


    @Override
    public void onMapReady(GoogleMap map){
        gMap =map;
        gMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        gMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(37.3804787, 126.9264623),15));
        gMap.getUiSettings().setZoomControlsEnabled(true);

        mSungkyul=gMap.addMarker(new MarkerOptions().position(new LatLng(37.3804787, 126.9264623)).title("성결대학교").snippet("사립대학교 4년제"));
        mSungkyul.setTag(0);
        mBungye = gMap.addMarker(new MarkerOptions().position(new LatLng(37.3898024, 126.9505066)).title("범계역").snippet("범계역 4호선"));
        mBungye.setTag(0);
        mAnyang = gMap.addMarker(new MarkerOptions().position(new LatLng(37.4004557, 126.9210828)).title("안양1번가").snippet("안양일번가"));
        mAnyang.setTag(0);
        mBungye1 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.390642, 126.9523866)).title("북창동순두부 범계점").snippet("한식"));
        mBungye1.setTag(0);
        mBungye2 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.390776, 126.952762)).title("밥사랑 범계점").snippet("한식"));
        mBungye2.setTag(0);
        mBungye3 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.3899646, 126.9534071)).title("순남시래기 범계점").snippet("한식"));
        mBungye3.setTag(0);
        mBungye4 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.390962, 126.9535304)).title("듬박이 범계점").snippet("한식"));
        mBungye4.setTag(0);

        mBungye5 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.3908659,126.9532624)).title("짬뽕타임 범계점").snippet("중식"));
        mBungye5.setTag(0);
        mBungye6 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.3902211, 126.9526322)).title("홍콩반점 범계점").snippet("중식"));
        mBungye6.setTag(0);
        mBungye7 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.390642, 126.9553485)).title("산해원 범계점").snippet("중식"));
        mBungye7.setTag(0);
        mBungye8 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.3914294, 126.9533819)).title("드래곤 범계점").snippet("중식"));
        mBungye8.setTag(0);

        mBungye9 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.3903378, 126.9540235)).title("아오리라멘 범계점").snippet("일식"));
        mBungye9.setTag(0);
        mBungye10 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.3909914, 126.954908)).title("고베규카츠 범계점").snippet("일식"));
        mBungye10.setTag(0);
        mBungye11 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.3903656, 126.953036)).title("교토가츠규 범계점").snippet("일식"));
        mBungye11.setTag(0);
        mBungye12 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.3913804, 126.9545111)).title("라멘키분 범계점").snippet("일식"));
        mBungye12.setTag(0);

        mBungye13 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.3905612, 126.9523329)).title("엔제리너스 범계점").snippet("카페/디저트"));
        mBungye13.setTag(0);
        mBungye14 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.3903039, 126.9518149)).title("탐앤탐스 범계점").snippet("카페/디저트"));
        mBungye14.setTag(0);
        mBungye15 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.3908227, 126.953137)).title("빽다방 범계점").snippet("카페/디저트"));
        mBungye15.setTag(0);
        mBungye16 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.3914502, 126.9549885)).title("스타벅스 범계점").snippet("카페/디저트"));
        mBungye16.setTag(0);

        mBungye17 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.3909998, 126.9549862)).title("쿠우쿠우 범계점").snippet("뷔페"));
        mBungye17.setTag(0);
        mBungye18 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.3901888, 126.9502597)).title("계절밥상 범계점").snippet("뷔페"));
        mBungye18.setTag(0);
        mBungye19 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.3891962, 126.9510886)).title("애슐리 범계점").snippet("뷔페"));
        mBungye19.setTag(0);
        mBungye20 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.3902213, 126.9504256)).title("끌레드쉐프 범계점").snippet("뷔페"));
        mBungye20.setTag(0);

        mBungye21 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.3910158, 126.9537062)).title("구스테이블 범계점").snippet("양식"));
        mBungye21.setTag(0);
        mBungye22 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.3906842, 126.9538978)).title("서가앤쿡 범계점").snippet("양식"));
        mBungye22.setTag(0);
        mBungye23 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.3910091, 126.9535145)).title("어글리스토브 범계점").snippet("양식"));
        mBungye23.setTag(0);

        mBungye24 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.3907831, 126.9544644)).title("교동전선생 범계점").snippet("주점"));
        mBungye24.setTag(0);
        mBungye25 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.3906002, 126.9537262)).title("포차어게인 범계점").snippet("주점"));
        mBungye25.setTag(0);
        mBungye26 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.390349, 126.952955)).title("에잇피스 범계점").snippet("주점"));
        mBungye26.setTag(0);
        mBungye27 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.3910696, 126.9537179)).title("사니스펍앤그릴 범계점").snippet("주점"));
        mBungye27.setTag(0);

        mBungye28 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.3899289, 126.9533758)).title("고봉민김밥인 범계점").snippet("분식"));
        mBungye28.setTag(0);
        mBungye29 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.390287, 126.954931)).title("신전떡볶이 범계점").snippet("분식"));
        mBungye29.setTag(0);
        mBungye30 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.3909469, 126.9531962)).title("진미떡볶이 범계점").snippet("분식"));
        mBungye30.setTag(0);
        mBungye31 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.3903795, 126.9516626)).title("신포우리만두 범계점").snippet("분식"));
        mBungye31.setTag(0);

        mBungye32 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.3901755, 126.9521681)).title("맘스터치 범계점").snippet("패스트푸드"));
        mBungye32.setTag(0);
        mBungye33 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.3904142, 126.9534996)).title("모스버거 범계점").snippet("패스트푸드"));
        mBungye33.setTag(0);
        mBungye34 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.399509, 126.921863)).title("미스터피자 범계점").snippet("패스트푸드"));
        mBungye34.setTag(0);
        mBungye35 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.390643, 126.9551622)).title("오리지널시카고피자 범계점").snippet("패스트푸드"));
        mBungye35.setTag(0);

        mAnyang1 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.4001087, 126.9215283)).title("무한갈비고수 안양1번가").snippet("한식, 육류, 고기요리"));
        mAnyang1.setTag(0);
        mAnyang2 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.3982203, 126.9233998)).title("안양감자탕 안양1번가").snippet("한식, 감자탕"));
        mAnyang2.setTag(0);
        mAnyang3 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.398987, 126.923562)).title("곱창폭식 안양1번가").snippet("한식, 곱창, 막창, 양"));
        mAnyang3.setTag(0);
        mAnyang4 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.397991, 126.923849)).title("홍가네 영양센타 안양1번가").snippet("한식, 백숙, 삼계탕"));
        mAnyang4.setTag(0);
        mAnyang5 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.3999171, 126.9214722)).title("호윤식당 안양1번가").snippet("한식"));
        mAnyang5.setTag(0);
        mAnyang6 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.3984306, 126.9240357)).title("찌개마을502 안양1번가").snippet("한식, 찌개, 전골"));
        mAnyang6.setTag(0);

        mAnyang7 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.4001019, 126.9229773)).title("홍콩반점 안양1번가").snippet("중식"));
        mAnyang7.setTag(0);
        mAnyang8 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.3986435,126.922523)).title("북경짜장2900 안양1번가").snippet("중식"));
        mAnyang8.setTag(0);
        mAnyang9 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.3996962,126.922676)).title("니뽕내뽕 안양1번가").snippet("중식"));
        mAnyang9.setTag(0);
        mAnyang10 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.398031,126.924522)).title("찰스탕수육 안양1번가").snippet("중식"));
        mAnyang10.setTag(0);
        mAnyang11 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.3990463,126.9205141)).title("윤가네짜장 안양1번가").snippet("중식"));
        mAnyang11.setTag(0);
        mAnyang12 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.39928,126.923882)).title("만리장성 안양1번가").snippet("중식"));
        mAnyang12.setTag(0);

        mAnyang13 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.3987982,126.9221805)).title("이찌방 안양1번가").snippet("일식"));
        mAnyang13.setTag(0);
        mAnyang14 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.3990077,126.9222444)).title("명동돈까스 안양1번가").snippet("일식"));
        mAnyang14.setTag(0);
        mAnyang15 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.3999302,126.9236365)).title("스시히로바미니 안양1번가").snippet("일식"));
        mAnyang15.setTag(0);
        mAnyang16 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.4002015,126.922573)).title("고베규카츠 안양1번가").snippet("일식"));
        mAnyang16.setTag(0);
        mAnyang17 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.3995999,126.9228004)).title("연어랑광어랑앤초밥 안양1번가").snippet("일식"));
        mAnyang17.setTag(0);
        mAnyang18 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.3994954,126.9225418)).title("돈돈정 안양1번가").snippet("일식"));
        mAnyang18.setTag(0);

        mAnyang19 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.4002161,126.9221539)).title("블랙스톤 안양1번가").snippet("양식"));
        mAnyang19.setTag(0);
        mAnyang20 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.3981682,126.9224917)).title("로랜스308 안양1번가").snippet("양식"));
        mAnyang20.setTag(0);
        mAnyang21 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.3988126,126.9234199)).title("서가앤쿡 안양1번가").snippet("양식"));
        mAnyang21.setTag(0);
        mAnyang22 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.3991765,126.9230262)).title("어반시크 안양1번가").snippet("양식"));
        mAnyang22.setTag(0);
        mAnyang23 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.4018526,126.922145)).title("코벤트가든 안양1번가").snippet("양식"));
        mAnyang23.setTag(0);
        mAnyang24 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.400136,126.922308)).title("lululala 안양1번가").snippet("양식"));
        mAnyang24.setTag(0);

        mAnyang25 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.3985843,126.9231799)).title("하쿠하쿠 안양1번가").snippet("주점"));
        mAnyang25.setTag(0);
        mAnyang26 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.399203,126.9225906)).title("지스타에일 안양1번가").snippet("주점"));
        mAnyang26.setTag(0);
        mAnyang27 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.3990878,126.9226697)).title("아지트 안양1번가").snippet("주점"));
        mAnyang27.setTag(0);
        mAnyang28 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.398575,126.9237217)).title("임창정의 소주한잔  안양1번가").snippet("주점"));
        mAnyang28.setTag(0);
        mAnyang29 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.4002147,126.9227551)).title("알콜트리 안양1번가").snippet("주점"));
        mAnyang29.setTag(0);
        mAnyang30 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.3987478,126.9224404)).title("삼구포차 안양1번가").snippet("주점"));
        mAnyang30.setTag(0);

        mAnyang31 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.3984368,126.9224558)).title("빨봉분식 안양1번가").snippet("분식"));
        mAnyang31.setTag(0);
        mAnyang32 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.3980362,126.9229624)).title("모이세분식 안양1번가").snippet("분식"));
        mAnyang32.setTag(0);
        mAnyang33 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.3998444,126.9225004)).title("두끼떡볶이 안양1번가").snippet("분식"));
        mAnyang33.setTag(0);
        mAnyang34 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.3997792,126.9233579)).title("청년다방 안양1번가").snippet("분식"));
        mAnyang34.setTag(0);

        mAnyang35 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.3990953,126.9219498)).title("설빙 안양1번가").snippet("카페/디저트"));
        mAnyang35.setTag(0);
        mAnyang36 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.3998163,126.9219871)).title("도쿄빙수 안양1번가").snippet("카페/디저트"));
        mAnyang36.setTag(0);
        mAnyang37 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.399631,126.9214439)).title("kafe await 안양1번가").snippet("카페/디저트"));
        mAnyang37.setTag(0);
        mAnyang38 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.399693,126.922153)).title("쁘띠렌 안양1번가").snippet("카페/디저트"));
        mAnyang38.setTag(0);

        mAnyang39 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.399596,126.922)).title("스시스미스 안양1번가").snippet("뷔페"));
        mAnyang39.setTag(0);
        mAnyang40 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.3994519,126.9222007)).title("착한돼지 안양1번가").snippet("뷔페"));
        mAnyang40.setTag(0);
        mAnyang41 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.4014442,126.9224547)).title("풀잎채 안양1번가").snippet("뷔페"));
        mAnyang41.setTag(0);
        mAnyang42 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.3991182,126.9206353)).title("우리뷔페 안양1번가").snippet("뷔페"));
        mAnyang42.setTag(0);

        mAnyang43 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.3993473,126.9214548)).title("맘스터치 안양1번가").snippet("패스트푸드"));
        mAnyang43.setTag(0);
        mAnyang44 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.3995279,126.9217387)).title("미스터피자 안양1번가").snippet("패스트푸드"));
        mAnyang44.setTag(0);
        mAnyang45 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.398804,126.923029)).title("맥도날드 안양1번가").snippet("패스트푸드"));
        mAnyang45.setTag(0);
        mAnyang46 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.398579,126.9222051)).title("KFC 안양1번가").snippet("패스트푸드"));
        mAnyang46.setTag(0);

        /* mSungkyul1 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.382109,126.929814)).title("오봉도시락 성결대점").snippet("한식, 도시락"));
        mSungkyul1.setTag(0); */
        mSungkyul2 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.383338,126.933)).title("대박집 성결대점").snippet("한식, 고기"));
        mSungkyul2.setTag(0);
        mSungkyul3 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.382227,126.929687)).title("허가네맛집 성결대점").snippet("한식"));
        mSungkyul3.setTag(0);

        mSungkyul4 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.382195,126.930489)).title("하카타 성결대점").snippet("일식"));
        mSungkyul4.setTag(0);
        mSungkyul5 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.3866989,126.9307792)).title("슈니첼 성결대점").snippet("일식"));
        mSungkyul5.setTag(0);
        mSungkyul6 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.383904,126.931397)).title("오늘은 수제돈가스 성결대점").snippet("일식"));
        mSungkyul6.setTag(0);
        mSungkyul7 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.3848508,126.9322421)).title("두번째 식탁 성결대점").snippet("일식"));
        mSungkyul7.setTag(0);

        mSungkyul8 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.383298,126.932867)).title("술도가전집 성결대 만안구청점").snippet("주점"));
        mSungkyul8.setTag(0);
        mSungkyul9 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.3865772,126.9312052)).title("옥이네칼국수 철이네포차 만안구청점").snippet("주점"));
        mSungkyul9.setTag(0);
        mSungkyul10 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.38503,126.934753)).title("종로빈대떡 성결대점").snippet("주점"));
        mSungkyul10.setTag(0);
        mSungkyul11 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.382364,126.930841)).title("자갈치회포차 성결대점").snippet("주점"));
        mSungkyul11.setTag(0);

        mSungkyul12 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.3875731,126.9335921)).title("한맛외식 명학역점").snippet("뷔페"));
        mSungkyul12.setTag(0);
        mSungkyul13 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.3881066,126.9298969)).title("호남한식 만안구점").snippet("뷔페"));
        mSungkyul13.setTag(0);

        mSungkyul14 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.382795,126.931747)).title("남촌김밥 성결대점").snippet("분식"));
        mSungkyul14.setTag(0);
        mSungkyul15 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.382723,126.931106)).title("동대문 엽기떡볶이 성결대점").snippet("분식"));
        mSungkyul15.setTag(0);
        mSungkyul16 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.380816,126.929972)).title("벧엘김밥 성결대점").snippet("분식"));
        mSungkyul16.setTag(0);
        mSungkyul17 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.382496,126.931073)).title("신전떡볶이 성결대점").snippet("분식"));
        mSungkyul17.setTag(0);


        mSungkyul20 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.3861569,126.9314249)).title("하오하오 만안구점").snippet("중식"));
        mSungkyul20.setTag(0);
        mSungkyul21 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.382395,126.930955)).title("황궁쟁반짜장 성결대점").snippet("중식"));
        mSungkyul21.setTag(0);

        mSungkyul22 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.3843958,126.92764)).title("개와 고양이의 시간 만안구점").snippet("카페/디저트"));
        mSungkyul22.setTag(0);
        mSungkyul23 = gMap.addMarker(new MarkerOptions().position(new LatLng(137.383664,126.933453)).title("본아미치 성결대점").snippet("카페/디저트"));
        mSungkyul23.setTag(0);
        mSungkyul24 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.382104,126.929847)).title("EDIYA 커피 성결대점").snippet("카페/디저트"));
        mSungkyul24.setTag(0);

        mSungkyul25 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.381942,126.930028)).title("The pan 성결대점").snippet("양식"));
        mSungkyul25.setTag(0);
        mSungkyul26 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.3832767,126.9336207)).title("기지개 피자 성결대점").snippet("양식"));
        mSungkyul26.setTag(0);
        mSungkyul27 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.382784,126.931218)).title("피자스쿨 성결대점").snippet("패스트푸드"));
        mSungkyul27.setTag(0);

        mSungkyul28 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.382175,126.930057)).title("맘스터치 성결대점").snippet("패스트푸드"));
        mSungkyul28.setTag(0);
        mSungkyul29 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.382298,126.930268)).title("요거프레소 성결대점").snippet("패스트푸드"));
        mSungkyul29.setTag(0);
        mSungkyul30 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.385636,126.932663)).title("롯데리아 만안구청점").snippet("패스트푸드"));
        mSungkyul30.setTag(0);

        mAdd1  = gMap.addMarker(new MarkerOptions().position(new LatLng(37.399375,126.923216)).title("홍대개미 안양1번가점").snippet("일식"));
        mSungkyul30.setTag(0);
        mAdd2 = gMap.addMarker(new MarkerOptions().position(new LatLng(37.395146,126.961341)).title("마루샤브 평촌점").snippet("일식"));
        mSungkyul30.setTag(0);
        mAdd3  = gMap.addMarker(new MarkerOptions().position(new LatLng(37.399994,126.977332)).title("사조회참치 인덕원점").snippet("일식"));
        mSungkyul30.setTag(0);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        super.onCreateOptionsMenu(menu);
        menu.add(0,1,0,"일반 지도");
        menu.add(0,2,0,"위성 지도");
        menu.add(0,3,0,"범계역");
        menu.add(0,4,0,"안양1번가");
        menu.add(0,5,0,"성결대학교");
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch(item.getItemId()){
            case 1: gMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
                return true;
            case 2: gMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
                return true;
            case 3: gMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng( 37.3898582,126.9484383),15));
                return true;
            case 4: gMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng( 37.4004557,126.9210828),15));
                return true;
            case 5: gMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng( 37.3801654,126.9275862),15));
                return true;
        }
        return false; }

}



