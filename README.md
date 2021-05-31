# kotlin-binary-compatibility-validator-issue
This repo shows the issue https://github.com/Kotlin/binary-compatibility-validator/issues/55

To dump the API, just run `make` or `./gradlew mylibrary:apiDump` and check the result file under `mylibrary/api/mylibrary.api`.

Here is the result file with kotlin 1.4.32

[Commit](https://github.com/4brunu/kotlin-binary-compatibility-validator-issue/commit/b7499eaf8dc2116bc18e614f2e1bb3c013f6846a)

[mylibrary.api](https://github.com/4brunu/kotlin-binary-compatibility-validator-issue/blob/b7499eaf8dc2116bc18e614f2e1bb3c013f6846a/mylibrary/api/mylibrary.api#L1-L7)


Here is the result file with kotlin 1.5.0

[Commit](https://github.com/4brunu/kotlin-binary-compatibility-validator-issue/commit/30ad487e8b5286238bb2d838422cf272248f1f74)

[mylibrary.api](https://github.com/4brunu/kotlin-binary-compatibility-validator-issue/blob/30ad487e8b5286238bb2d838422cf272248f1f74/mylibrary/api/mylibrary.api#L1-L15)
