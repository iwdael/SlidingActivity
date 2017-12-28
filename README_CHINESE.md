# SlidingActivity  [![](https://jitpack.io/v/aliletter/slidingactivity.svg)](https://jitpack.io/#aliletter/slidingactivity)
在安卓应用程序中，右滑返回上一页并销毁当前页面是一个比较常见的功能。 SlidingActivity只是为了帮助我们实现这个功能，你只需要一个简单的配置功能就可以实现它。
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
## 如何配置
将本仓库引入你的项目:
### Step 1. 添加JitPack仓库到Build文件
合并以下代码到项目根目录下的build.gradle文件的repositories尾。[点击查看详情](https://github.com/aliletter/CarouselBanner/blob/master/root_build.gradle.png)
```Java
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
### Step 2. 添加依赖   
合并以下代码到需要使用的application Module的dependencies尾。[点击查看详情](https://github.com/aliletter/CarouselBanner/blob/master/application_build.gradle.png)
```Java
	dependencies {
                ...
	        compile 'com.github.aliletter:slidingactivity:v1.0.3'
	}
```
<br><br>
![Image Text](https://github.com/aliletter/SlidingActivity/blob/master/slidingactivity.gif)
<br><br><br>
## 感谢浏览
如果你有任何疑问，请加入QQ群，我将竭诚为你解答。欢迎Star和Fork本仓库，当然也欢迎你关注我。
<br>
![Image Text](https://github.com/aliletter/CarouselBanner/blob/master/qq_group.png)
