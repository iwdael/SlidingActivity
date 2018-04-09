# SlidingActivity  [![](https://jitpack.io/v/blackchopper/slidingactivity.svg)](https://jitpack.io/#blackchopper/slidingactivity)
In the android application, a right-click to return to the previous page and destroy the current page is a more common feature. SlidingActivity just to help us to achieve this function, you only need a simple configuration function can achieve it.[中文文档](https://github.com/blackchopper/SlidingActivity/blob/master/README_CHINESE.md)
## Instruction
Need to slide right out of the Activity must use a transparent theme.
### Code Sample
If many classes need to implement the right slide exit function, it is recommended to achieve in the base class.
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
SlidingActivity comes with a transparent theme.
```Java
    <style name="ThemeSlidingActivity" parent="@android:style/Theme.Translucent.NoTitleBar" />
```
## How to
To get a Git project into your build:
### Step 1. Add the JitPack repository to your build file
Add it in your root build.gradle at the end of repositories.   [click here for details](https://github.com/blackchopper/CarouselBanner/blob/master/root_build.gradle.png)
```Java
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
### Step 2. Add the dependency
Add it in your application module build.gradle at the end of dependencies where you want to use.   [click here for details](https://github.com/blackchopper/CarouselBanner/blob/master/application_build.gradle.png)
```Java
	dependencies {
                ...
	        compile 'com.github.blackchopper:slidingactivity:v1.0.4'
	}
```
<br><br>
![Image Text](https://github.com/blackchopper/SlidingActivity/blob/master/slidingactivity.gif)
<br><br><br>
## Thank you for your browsing
If you have any questions, please join the QQ group. I will do my best to answer it for you. Welcome to star and fork this repository, alse follow me.
<br>
![Image Text](https://github.com/blackchopper/CarouselBanner/blob/master/qq_group.png)
