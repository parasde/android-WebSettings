...     

        val settings: WebSettings = webview.settings
        WebView.setWebContentsDebuggingEnabled(true)
        settings.cacheMode = WebSettings.LOAD_NO_CACHE
        settings.javaScriptEnabled = true
        //웹뷰 확대 설정 html meta 태그 viewport 연계.
        settings.builtInZoomControls = true
        settings.useWideViewPort = true
        settings.displayZoomControls = false //웹뷰 돋보기 버튼 숨기기
        //웹뷰 확대 설정 끝
        settings.textZoom = 100
        webview.setBackgroundColor(0x01000000)

        CookieManager.getInstance().setAcceptCookie(true)
        CookieManager.getInstance().setAcceptThirdPartyCookies(webview, true)


...
        // webview event 처리
        private val webViewClient = object: WebViewClient() {
            override fun onPageFinished(view: WebView?, url: String?) {
                super.onPageFinished(view, url)
                // 쿠키 동기화
                CookieManager.getInstance().flush()
            }
            
...
