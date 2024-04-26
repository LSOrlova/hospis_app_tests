package ru.iteco.fmhandroid;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.matcher.ViewMatchers.isRoot;
import static ru.iteco.fmhandroid.WaitId.waitId;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import io.qameta.allure.android.runners.AllureAndroidJUnit4;
import io.qameta.allure.kotlin.Story;
import io.qameta.allure.kotlin.junit4.Tag;
import ru.iteco.fmhandroid.pages.OurMissionPage;
import ru.iteco.fmhandroid.steps.AuthorizationSteps;
import ru.iteco.fmhandroid.steps.OurMissionSteps;
import ru.iteco.fmhandroid.ui.AppActivity;
import ru.iteco.fmhandroid.pages.AuthorizationPage;

@LargeTest
@RunWith(AllureAndroidJUnit4.class)
public class OurMissionTest {
    AuthorizationPage authorizationPage = new AuthorizationPage();
    AuthorizationSteps authorizationSteps = new AuthorizationSteps(authorizationPage);
    OurMissionPage missionPage = new OurMissionPage();
    OurMissionSteps ourMissionSteps = new OurMissionSteps(missionPage);
    @Rule
    public ActivityScenarioRule<AppActivity> activityTestRule = new ActivityScenarioRule<>(AppActivity.class);


    @Before
    public void setUp() {
        onView(isRoot()).perform(waitId(authorizationPage.getAppBarFragmentMain(), 5000));
        if (authorizationSteps.isDisplayedButtonProfile()) {
            authorizationSteps.clickLogOutButton();
        }
    }
    public void loginAuth() {
        AuthorizationSteps login = new AuthorizationSteps(authorizationPage);
        login.login();
        try {
            authorizationSteps.textAuthorization();
        } catch (androidx.test.espresso.NoMatchingViewException e) {
            authorizationSteps.clickExitButton();
            authorizationSteps.clickLogOutButton();
        }
    }

    @Test
    @Tag("37")
    @Story("Кнопка Свернуть / Развернуть запись по стрелке")
    public void clickOurMissionExpandItem() {
        ourMissionSteps.clickOurMissionButton();
        ourMissionSteps.ourMissionExpandItem();
        ourMissionSteps.ourMissionItemText();
    }
}

