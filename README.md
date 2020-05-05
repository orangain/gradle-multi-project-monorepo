# gradle-multi-project-monorepo

This is an example project to use Gradle multi-project build in monorepo.

## Description

In this example, there are four subprojects:

* [apps/account-app](https://github.com/orangain/gradle-multi-project-monorepo/tree/master/apps/account-app)
* [apps/inventory-app](https://github.com/orangain/gradle-multi-project-monorepo/tree/master/apps/inventory-app)
* [libs/greeter](https://github.com/orangain/gradle-multi-project-monorepo/tree/master/libs/greeter)
* [libs/profile](https://github.com/orangain/gradle-multi-project-monorepo/tree/master/libs/profile)

They have the following dependency:

![Both apps/account-app and apps/inventory-app depend on libs/profile and only apps/account-app depends on libs/greeter](https://github.com/orangain/gradle-multi-project-monorepo/raw/master/docs/deps.svg)