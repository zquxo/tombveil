document.addEventListener("DOMContentLoaded", function () {

    /*
     * ページ読み込み時のフェードイン
     */

    document.body.classList.add("loaded");


    /*
     * スクロールすると要素を表示
     */

    const elements =
        document.querySelectorAll(".fade-in");


    const observer =
        new IntersectionObserver(
            function (entries) {

                entries.forEach(
                    function (entry) {

                        if (entry.isIntersecting) {

                            entry.target.classList.add(
                                "show"
                            );

                        }

                    }
                );

            }
        );


    elements.forEach(
        function (element) {

            observer.observe(element);

        }
    );

});