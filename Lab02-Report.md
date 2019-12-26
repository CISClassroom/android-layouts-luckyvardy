# รายงานผลการทดลอง

<นาย สุรพร อินพิลึก> <603410157-9>

## Relative Layout

แสดง Control `title` และ `Detail`

<?xml version="1.0" encoding="utf-8"?>

<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".RelativeActivity">

    <RelativeLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:orientation="horizontal">

        <Button
            android:id="@+id/button4"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Button" />

        <EditText
            android:id="@+id/editText6"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:ems="10"
            android:inputType="textPersonName"
            android:text="Name" />

        <EditText
            android:id="@+id/editText5"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:ems="10"
            android:inputType="textPersonName"
            android:layout_above="@id/editText6"
            android:text="Name" />
    </RelativeLayout>

</androidx.constraintlayout.widget.ConstraintLayout>

แอดทริบิ้วที่แสดงความสัมพันธ์ระหว่าง control ทั้งสอง

android:layout_above="@id/editText6"

## Linear Layout

แสดง Control `to`, `subject`, `tag` และ `message`

<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    tools:context=".LinearActivity">

    <EditText
        android:id="@+id/editText"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:ems="10"
        android:inputType="textPersonName"
        android:text="Name"
        tools:layout_editor_absoluteX="81dp"
        tools:layout_editor_absoluteY="46dp" />

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_weight="1"
        android:orientation="horizontal">

        <EditText
            android:id="@+id/editText2"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:ems="10"
            android:inputType="textPersonName"
            android:text="Name"
            tools:layout_editor_absoluteX="81dp"
            tools:layout_editor_absoluteY="119dp" />

        <EditText
            android:id="@+id/editText3"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:ems="10"
            android:inputType="textPersonName"
            android:text="Name"
            tools:layout_editor_absoluteX="79dp"
            tools:layout_editor_absoluteY="199dp" />

    </LinearLayout>

    <EditText
        android:id="@+id/editText4"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_weight="1"
        android:ems="10"
        android:gravity="start|top"
        android:inputType="textMultiLine" />

    <Button
        android:id="@+id/button4"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Button"
        tools:layout_editor_absoluteX="135dp"
        tools:layout_editor_absoluteY="280dp" />
</LinearLayout>

อธิบายความแตกต่างระหว่าง vertical และ horizontal orientation

```
// คำตอบ
```

## Constrant Layout

จงออกแบบและสร้างหน้า Constrant layout สำหรับแสดงข้อมูลนักศึกษา ประกอบไปด้วย รูปโปรไฟล์ รูปพื้นหลัง ชื่อ-นามสกุล รหัสนักศึกษา และเกรดเฉลี่ยรวม
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".ProfileActivity">


    <ImageView
        android:id="@+id/imageView6"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        app:srcCompat="@color/colorPrimaryDark" />

    <ImageView
        android:id="@+id/imageView2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignParentStart="true"
        android:layout_alignParentTop="true"
        android:layout_alignParentEnd="true"
        android:layout_marginStart="0dp"
        android:layout_marginTop="-200dp"
        android:layout_marginEnd="0dp"
        app:srcCompat="@drawable/luck" />

    <de.hdodenhof.circleimageview.CircleImageView
        android:id="@+id/luck_image"
        android:layout_width="76dp"
        android:layout_height="204dp"
        android:layout_alignParentStart="true"

        android:layout_alignParentEnd="true"
        android:layout_marginStart="89dp"
        android:layout_marginTop="290dp"
        android:layout_marginEnd="96dp"
        android:src="@drawable/luck"
        app:civ_border_color="#FFFFFF"
        app:civ_border_width="2dp" />

    <LinearLayout
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:orientation="vertical">

        <TextView
            android:id="@+id/textView"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_below="@id/luck_image"
            android:layout_marginStart="100dp"
            android:layout_marginTop="520dp"
            android:layout_marginEnd="10dp"
            android:layout_marginBottom="100dp"
            android:text="นาย สุรพร อินพิลึก"
            android:textColor="#FFFFFF"
            android:textColorHighlight="#9C27B0"
            android:textSize="20sp"
            android:textStyle="bold" />


        <TextView
            android:id="@+id/textView1"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_below="@id/textView"
            android:layout_marginStart="100dp"
            android:layout_marginTop="-70dp"
            android:layout_marginEnd="0dp"
            android:layout_marginBottom="50dp"
            android:text="รหัสนักศึกษา 603410157-9"
            android:textColor="#FFFFFF"
            android:textColorHighlight="#9C27B0"
            android:textSize="18sp" />

        <TextView
            android:id="@+id/textView2"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_below="@id/textView1"
            android:layout_marginStart="100dp"
            android:layout_marginTop="-40dp"
            android:layout_marginEnd="50dp"
            android:layout_marginBottom="10dp"
            android:text="เกรดเฉลี่ยรวม : 2.18"
            android:textColor="#FFFFFF"
            android:textColorHighlight="#9C27B0"
            android:textSize="18sp" />

    </LinearLayout>

</RelativeLayout>
