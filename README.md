# gradle-multi-project-monorepo

This is an example project to use Gradle multi-project build in monorepo. It uses GitHub Actions's [on.push.paths](https://help.github.com/en/actions/reference/workflow-syntax-for-github-actions#onpushpull_requestpaths) to build only changed sub-project of the project.

## Description

In this example, there are four subprojects:

* [apps/account-app](https://github.com/orangain/gradle-multi-project-monorepo/tree/master/apps/account-app)
* [apps/inventory-app](https://github.com/orangain/gradle-multi-project-monorepo/tree/master/apps/inventory-app)
* [libs/greeter](https://github.com/orangain/gradle-multi-project-monorepo/tree/master/libs/greeter)
* [libs/profile](https://github.com/orangain/gradle-multi-project-monorepo/tree/master/libs/profile)

They have the following dependency:

![Both apps/account-app and apps/inventory-app depend on libs/profile and only apps/account-app depends on libs/greeter](https://github.com/orangain/gradle-multi-project-monorepo/raw/master/docs/deps.svg)

By using `on.push.paths`, only changed apps can be built as follows:

* When a file under the `apps/account-app` is [changed](https://github.com/orangain/gradle-multi-project-monorepo/pull/1), only the `account-app` will be built.
  ![Only the account-app is built](https://github.com/orangain/gradle-multi-project-monorepo/raw/master/docs/screenshot1.png)
* When a file under  the `libs/profile` is [changed](https://github.com/orangain/gradle-multi-project-monorepo/pull/2), both the `account-app` and the `inventory-app` will be built.
  ![both the account-app and the inventory-app will be built](https://github.com/orangain/gradle-multi-project-monorepo/raw/master/docs/screenshot2.png)
