# SlidingActivity
[![](https://img.shields.io/badge/platform-android-orange.svg)](https://github.com/hacknife) [![](https://img.shields.io/badge/language-java-yellow.svg)](https://github.com/hacknife) [![](https://img.shields.io/badge/JCenter-1.0.5-brightgreen.svg)](http://jcenter.bintray.com/com/hacknife/slidingactivity/) [![](https://img.shields.io/badge/build-passing-brightgreen.svg)](https://github.com/hacknife) [![](https://img.shields.io/badge/license-apache--2.0-green.svg)](https://github.com/hacknife) [![](https://img.shields.io/badge/api-11+-green.svg)](https://github.com/hacknife)<br/><br/>
在安卓应用程序中，右滑返回上一页并销毁当前页面是一个比较常见的功能。 SlidingActivity只是为了帮助我们实现这个功能，你只需要一个简单的配置功能就可以实现它。
<br><br>
![Image Text](https://github.com/blackchopper/SlidingActivity/blob/master/slidingactivity.gif)
<br><br>
## 使用说明
需要右滑退出的Activity必须使用透明主题。
### 代码示例
如果许多类都需要实现右滑退出功能，建议在基类中实现。
```Java
public class BaseActivity extends Activity {
    protected SwipeBackLayout layout;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        layout = new SwipeBackLayout(this);
        layout.setShadowDrawable(R.drawable.slidingactivity_shadow_left);
        layout.attachToActivity(this);
    }
}
```
SlidingActivity中自带的一个透明主题。
```Java
    <style name="ThemeSlidingActivity" parent="@android:style/Theme.Translucent.NoTitleBar" />
```
## 快速引入项目
合并以下代码到需要使用Module的dependencies中。
```Java
	dependencies {
                ...
	        compile 'com.hacknife:slidingactivity:1.0.5'
	}
```
<br>
## 感谢浏览
如果你有任何疑问，请加入QQ群，我将竭诚为你解答。欢迎Star和Fork本仓库，当然也欢迎你关注我。
<br>
![Image Text](https://github.com/blackchopper/CarouselBanner/blob/master/qq_group.png)
